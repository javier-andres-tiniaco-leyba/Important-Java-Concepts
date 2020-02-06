import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Directories {
    public static void main(String[] args) {
        try {
            // Listing a file system's root directories
            Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
            for (Path name : dirs)
                System.err.println(name);

            // Creating a directory
            Path p = Paths.get("foo/bar/test");
            Files.createDirectories(p);

            // Create temporaty directory
            Files.createTempDirectory(Paths.get("."),"tmp");

            // Listing a directory's contents
            Path dir = Paths.get("../input_output");
            DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
            for(Path file : stream)
                System.out.println(file.getFileName());
            stream.close();

            // Filtering a directory listing by using globbing
            stream = Files.newDirectoryStream(dir, "*.{java,class,jar}");
            for(Path entry : stream)
                System.out.println(entry.getFileName());
            stream.close();

            // Writing custom directory filter
            DirectoryStream.Filter<Path> filter =
                new DirectoryStream.Filter<Path>() {
                    public boolean accept(Path file) {
                        return Files.isDirectory(file);
                    }
                };

            p = Paths.get("..");
            try (DirectoryStream<Path> dirStream =
                    Files.newDirectoryStream(p, filter)) {
                for(Path entry : dirStream)
                    System.out.println(entry.getFileName());
            } catch (IOException e) {
                System.err.println(e);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}