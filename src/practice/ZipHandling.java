package practice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
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
        // out.setLevel(Deflater.DEFLATED);
        // Files
        // .walk(source)
        // .filter(p -> !Files.isDirectory(p))
        // .forEach(
        // p -> {
        // ZipEntry entry = new ZipEntry(source.relativize(p).toString());
        // try {
        // out.putNextEntry(entry);
        // out.write(Files.readAllBytes(p));
        // out.closeEntry();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }
        // );
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // Files.copy(Path.of("./src/practice/files/input.txt"),
        // Path.of("./src/newFolder/inputCopy.txt"));

        // FileSystem fs = FileSystems.newFileSystem(zip);
        // Map<String, String> env = Map.of("create", "true");
        // FileSystem fs = FileSystems.newFileSystem(zip);

        // URI uri =
        // URI.create("file:///Users/vishalkushwaha/Documents/Java%20SE%2021/java-se-21/src");
        // Path src = Path.of(uri);
        // src.toRealPath();

        // Path target = fs.getPath("/messages.properties");
        // System.out.println(target);

        // Files.copy(source.resolve("messages.properties"), target);

        URI uri = URI.create("https://jsonplaceholder.typicode.com/todos/1");

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                .build();

        try {
        } catch ( Exception e) {
            e.printStackTrace();
        }

        FileSystem fs = FileSystems.getDefault();

    }
}
