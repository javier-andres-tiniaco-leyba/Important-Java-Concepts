import static java.nio.file.FileVisitResult.*;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class FileTree {

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("../..");
        PrintFiles pf = new PrintFiles();
        Files.walkFileTree(startingDir,pf);
    }

}

class PrintFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s", file);
        } else {
            System.out.format("Other: %s", file);
        }
        System.out.format("(%d bytes)%n", attr.size());
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exec) {
        System.out.format("Directory: %s%n", dir);
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path dir, IOException exec) {
        System.err.println(exec);
        return CONTINUE;
    }

}