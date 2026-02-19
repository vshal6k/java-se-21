package practice;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipHandling {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("./src/practice/resources");
        Path zip = Path.of("./src/practice/resources.zip");
        Files.deleteIfExists(zip);
        Files.createFile(zip);

        // try (ZipOutputStream out = new ZipOutputStream(Files.newOutputStream(zip))) {
        //     out.setLevel(Deflater.DEFLATED);
        //     Files
        //     .walk(source)
        //     .filter(p -> !Files.isDirectory(p))
        //     .forEach(
        //         p -> {
        //             ZipEntry entry = new ZipEntry(source.relativize(p).toString());
        //             try {
        //                 out.putNextEntry(entry);
        //                 out.write(Files.readAllBytes(p));
        //                 out.closeEntry();
        //             } catch (IOException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     );
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // Files.copy(Path.of("./src/practice/files/input.txt"), Path.of("./src/newFolder/inputCopy.txt"));

        // FileSystem fs = FileSystems.newFileSystem(zip);
        Map<String, String> env = Map.of("create", "true");
        FileSystem fs = FileSystems.newFileSystem(zip);
        
        Path target = fs.getPath("/messages.properties");
        System.out.println(target);

        Files.copy(source.resolve("messages.properties"), target);

    }
}
