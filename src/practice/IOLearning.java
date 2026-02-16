package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOLearning {

    public static void main(String[] args) {
        try (

                InputStream in = new FileInputStream(
                        "/Users/vishalkushwaha/Documents/Java SE 21/java-se-21/src/practice/files/input.txt");
                OutputStream out = new FileOutputStream(
                        "/Users/vishalkushwaha/Documents/Java SE 21/java-se-21/src/practice/files/output.txt");
                Reader inReader = new FileReader(
                        "/Users/vishalkushwaha/Documents/Java SE 21/java-se-21/src/practice/files/input.txt");
                Writer outWriter = new FileWriter(
                        "/Users/vishalkushwaha/Documents/Java SE 21/java-se-21/src/practice/files/output.txt");
                BufferedReader buffReader = new BufferedReader(new InputStreamReader(in));

                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(out));

        ) {
            // int length = 0;
            // byte[] buffer = new byte[1024];
            // length = in.read(buffer);
            // while (length != -1) {
            // for (int i = 0; i < length; i++) {
            // System.out.println(buffer[i]);
            // }
            // out.write(buffer, 0, length);
            // length = in.read(buffer);
            // }
            // in.transferTo(out);
            // byte[] indianRupee = {(byte)226, (byte)130, (byte)185};
            // out.write(indianRupee);
            // byte[] inputFileBytes =
            // Files.readAllBytes(Path.of("/Users/vishalkushwaha/Documents/Java SE
            // 21/java-se-21/src/practice/files/input.txt"));
            // for (byte b : inputFileBytes) {
            // System.out.println(b);
            // }
            // Charset utf8 = Charset.forName("utf-8");
            // int length = 0;
            // char[] buffer = new char[1024];
            // length = inReader.read(buffer);
            // while (length != -1) {
            // for (int i = 0; i < length; i++) {
            // System.out.println(buffer[i]);
            // }
            // outWriter.write(buffer, 0, length);
            // length = inReader.read(buffer);
            // }
            String line = null;
            while ((line = buffReader.readLine()) != null) {
                printWriter.println(line);
                printWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
