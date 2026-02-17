package practice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;

public class CustomSerialization implements Serializable {

    private transient int password;
    private transient String hash;
    private String username;

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        this.hash = (String) in.readObject();
    }

    private void writeObject(ObjectOutputStream out) throws ClassNotFoundException, IOException {
        out.defaultWriteObject();
        out.writeObject(generateHash(this.password));
    }

    public static void main(String[] args) {

    }

    public static String generateHash(Object o) {
        String hash = null;
        try (ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
                ObjectOutputStream out = new ObjectOutputStream(byteArrayStream)) {
            out.writeObject(o);
            out.flush();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            hash = md.digest(byteArrayStream.toByteArray()).toString();
            System.out.println(hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hash;
    }

}
