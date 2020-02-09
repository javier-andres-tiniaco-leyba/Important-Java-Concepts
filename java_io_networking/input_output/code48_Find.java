import static java.nio.file.FileVisitResult.*;
import static java.nio.file.FileVisitOption.*;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;

class Find {

    static class Finder extends SimpleFileVisitor<Path> {

        private final PathMatcher matcher;
        private int numMatches = 0;

        Finder(String pattern) {
            matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:"+pattern);
        }

        void find(Path file) {
            Path name = file.getFileName();
            if(name != null && matcher.matches(name)) {
                numMatches++;
                System.out.println(file);
            }
        }

        void done() {
            System.out.println("Matched: " + numMatches);
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
            find(file);
            return CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            find(dir);
            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            System.err.println(exc);
            return CONTINUE;
        }
    }

    public static void main(String[] args) throws IOException {
       if (args.length < 3 || !args[1].equals("-name"))
           usage();

       Path startingDir = Paths.get(args[0]);
       String pattern = args[2];

       Finder finder = new Finder(pattern);
       Files.walkFileTree(startingDir,finder);
       finder.done();
    }

    static void usage() {
        System.err.println("Java find <path> -name \"<glob_pattern>\"");
        System.exit(-1);
    }
}