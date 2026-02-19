package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileHandling {

    public static void main() throws IOException {
        // FileSystem fs = FileSystems.getDefault();
        // System.out.println(fs.getSeparator());

        // for (FileStore store : FileSystems.getDefault().getFileStores()) {
        // // long total = store.getTotalSpace() / 1024;
        // // long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / 1024;
        // // long avail = store.getUsableSpace() / 1024;
        // // System.out.format("%-20s %12d %12d %12d%n", store, total, used, avail);
        // System.out.println(store.name());
        // }

        // Path sourceDirectory = Path.of("/Users", "vishalkushwaha", "Documents", "Java
        // SE 21", "java-se-21");
        // System.out.println(Files.exists(sourceDirectory));

        // // Files.list(sourceDirectory).forEach(x -> System.out.println(x));
        // // Files.walk(sourceDirectory).filter(p ->
        // p.toString().contains(".java")).forEach(x -> System.out.println(x));

        // Path aPath = Path.of("/Users", "vishalkushwaha", "Documents", "Java SE 21",
        // "java-se-21", "src", "practice", "A.java");
        // Path aPathReal = aPath.toRealPath();

        // Path messagesBundle = aPath.resolve("../resources/messages.properties");

        // System.out.println(Files.exists(messagesBundle));

        // System.out.println(aPath.toString());
        // System.out.println(messagesBundle.toString());
        // System.out.println(messagesBundle.normalize().toString());

        // System.out.println(aPath.relativize(messagesBundle).toString());

        // System.out.println(messagesBundle.getParent());
        // System.out.println(messagesBundle.getRoot());

        // System.out.println(System.getProperty("user.dir"));

        // Path bPath = Path.of("src/practice/B.java");
        // // // System.out.println(Files.exists(bPath));
        // System.out.println(bPath);
        // // System.out.println(bPath.toAbsolutePath());

        // Path messageBundlePath = bPath.resolve("../resources/messages.properties");
        // System.out.println(messageBundlePath);
        // System.out.println(messageBundlePath.toAbsolutePath());
        // System.out.println(messageBundlePath.normalize());
        // System.out.println(messageBundlePath.toRealPath());

        // Files.createSymbolicLink(bPath, messageBundlePath);
        // System.out.println(bPath);
        // System.out.println(messageBundlePath);

        // Path bPath = Path.of("src/practice/B.java");
        // System.out.println(bPath);
        // Path symbolicLinkToB = Path.of("src/practice/blink.txt");
        // System.out.println(symbolicLinkToB);
        // Files.deleteIfExists(symbolicLinkToB);
        // System.out.println(symbolicLinkToB.getParent().relativize(bPath));
        // //
        // System.out.println(symbolicLinkToB.resolve(symbolicLinkToB.relativize(bPath)));
        // Files.createSymbolicLink(symbolicLinkToB,
        // symbolicLinkToB.getParent().relativize(bPath));
        // System.out.println(Files.readSymbolicLink(symbolicLinkToB));

        // Path bPath = Path.of("src/practice/B.java");
        // bPath = bPath.toRealPath();
        // for (int i = 0; i < bPath.getNameCount(); i++) {
        // System.out.println(bPath.getName(i));
        // }

        // Path source = Path.of(".").toRealPath();
        // Files.deleteIfExists(source.resolve("backup"));
        // Path backup = Files.createDirectory(source).toRealPath();
        // System.out.println(backup);

        // Files.walk(source.resolve("src")).sorted().forEach(
        //         p -> {
        //             try {
        //                 Files.copy(p, backup.resolve(source.relativize(p)));
        //             } catch (IOException e) {
        //                 e.printStackTrace();
        //             }
        //             System.out.println(p);
        //             System.out.println(backup.resolve(source.relativize(p)));
        //         });

        // Path source = Path.of("src/practice/root");
        // source = source.toRealPath();
        // Files.deleteIfExists(source);

        // Path target = Path.of("src/practice/rootNew");

        // Files.move(target, target.resolveSibling("rootNewSibling"));
    }

}
