import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

class Test {
    public static void main(String[] args) throws IOException{
        Path file = Paths.get("code22_check_file_or_directory.java");
        Path dir  = Paths.get(".");

        boolean isRegularExecutableFile = Files.isRegularFile(file) &
            Files.isReadable(file) & Files.isExecutable(file);

        boolean isRegularWritableFile = Files.isRegularFile(file) &
            Files.isWritable(file) & Files.isExecutable(file);

        System.out.println(file);
        System.out.println(file.toRealPath());
        System.out.format("isRegularExecutableFile: %s%n",
            isRegularExecutableFile);
        System.out.format("isRegularWritableFile: %s%n", isRegularWritableFile);
        System.out.format("isSymbolicFile: %s%n", Files.isSymbolicLink(file));

        System.out.println(dir);
        System.out.println(dir.toRealPath());
        System.out.format("isDir: %s%n", Files.isDirectory(dir));
    }
}
