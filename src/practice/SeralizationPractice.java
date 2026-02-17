package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SeralizationPractice {

    public static void main() {
        // List<Integer> list;

        // try (ObjectOutputStream out = new ObjectOutputStream(new
        // FileOutputStream("/Users/vishalkushwaha/Documents/Java SE
        // 21/java-se-21/src/practice/files/serializationFile.txt"))) {

        // list = List.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
        // out.writeObject(list);
        // out.flush();

        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // list = null;

        // try (ObjectInputStream in = new ObjectInputStream(new
        // FileInputStream("/Users/vishalkushwaha/Documents/Java SE
        // 21/java-se-21/src/practice/files/serializationFile.txt"))) {

        // Object o = in.readObject();
        // if(o instanceof List){
        // list = (List<Integer>) o;
        // list.stream().forEach(x -> System.out.println(x));
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // A a;

        // try (ObjectOutputStream out = new ObjectOutputStream(
        //         new FileOutputStream("src/practice/files/serializationFile.txt"))) {
            
        //     a = new A(1, "Vishal");
        //     out.writeObject(a);
        //     out.flush();

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // a = null;

        // try (ObjectInputStream in = new ObjectInputStream(
        //         new FileInputStream("src/practice/files/serializationFile.txt"))) {
            
        // a = (A) in.readObject();
        // System.out.println(a.id + " " + a.name);

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

    }
}
