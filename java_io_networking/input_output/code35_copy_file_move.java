import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.IOException;

/* https://docs.oracle.com/javase/8/docs/api/java/nio/file/StandardCopyOption.html */
class CopyMoveFile {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("xanadu.txt");
        Path target = Paths.get("copyTest.txt");
        Path targetMove = Paths.get("copyTestMoved.txt");

        Files.copy(source, target,
                StandardCopyOption.valueOf("REPLACE_EXISTING"),
                // For windows: java.lang.UnsupportedOperationException: Unsupported copy option
                //StandardCopyOption.valueOf("ATOMIC_MOVE"),
                StandardCopyOption.valueOf("COPY_ATTRIBUTES"));

        Files.move(target, targetMove);
    }
}