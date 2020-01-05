import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

// Delte directories,files or symbolic links
class Test {
    public static final String fileName = "test.txt";
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(fileName);
        try {
            Files.delete(path);
            System.out.println("Deleted file.");
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such file or directory%n", path);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", path);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }
    }
}
