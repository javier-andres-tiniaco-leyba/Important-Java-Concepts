import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class SymbolicLinks {
    public static void main(String[] args) {
        try {
            Path newLink = Paths.get("./helloLink");
            Path target = Paths.get("./code45_symbolic_links.java");
            // Symbolic or Soft link
            try {
                Files.createSymbolicLink(newLink, target);
            } catch (UnsupportedOperationException e) {
                // Some file systems do not support symbolic links
                System.err.println(e);
            }

            // hard link
            Path newLink2 = Paths.get("./hardlink");
            try {
                Files.createLink(newLink2, target);
            } catch (IOException x) {
                System.err.println(x);
            } catch (UnsupportedOperationException x) {
                // Some file systems do not support adding an existing
                // file to a directory.
                System.err.println(x);
            }

            // Test wheter a path is a symlink
            boolean isSymbolic = Files.isSymbolicLink(newLink);
            System.out.println(isSymbolic);

            // Find the target of a link
            try {
                System.out.format("Target of link '%s' is '%s'%n", newLink,
                        Files.readSymbolicLink(newLink));
            } catch (IOException x) {
                System.err.println(x);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
