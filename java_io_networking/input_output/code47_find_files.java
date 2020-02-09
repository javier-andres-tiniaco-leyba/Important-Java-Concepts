import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

class FindFile {
    public static void main(String[] args) {
        String pattern = "*.{java,class}";
        PathMatcher matcher = FileSystems.getDefault()
                .getPathMatcher("glob:"+pattern);

        Path fileName = Paths.get("hello.java");
        if(matcher.matches(fileName)) {
            System.out.println(fileName);
        }
    }
}