import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;
import java.io.IOException;
// import java.nio.file.NoSuchFileException;

class Test {
    public static void main(String[] args) throws IOException {

        // Creating a Path instance
        Path p1 = FileSystems.getDefault().getPath("/home/casa");
        Path path = Paths.get(System.getProperty("user.home"),"logs","foo.log");
        Path p3 = Paths.get("/tmp/foo");
        Path p4 = Paths.get(URI.create("file:///Users/joe/FileTest.java"));
        // Path p5 = Paths.get(args[0]);

        // Retrieve information from a Path instance
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        // Relative path can also be used suchas Paths.get("myfolder/myfile");

        // Convert path to string that can be opened from a browser
        System.out.format("%s%n",path.toUri());

        // Get absolute path of a file in the current dir
        // Path being pointed to does not have to exist
        System.out.format("%s%n", Paths.get("README.md").toAbsolutePath());
        System.out.format("%s%n", Paths.get("README.md").toUri());

        Path fp = Paths.get("README.md").toRealPath();
        System.out.format("%s%n",fp);

        // resolve two paths
        System.out.format("%s%n",
            path.getParent().resolve(Paths.get("README.md")));

        // find the relative path from one to another
        Path p5 = Paths.get("home");
        Path p6 = Paths.get("home/sally/bar");
        // Result is sally/bar
        Path p5_to_p6 = p5.relativize(p6);
        // Result is ../..
        Path p6_to_p5 = p6.relativize(p5);
        System.out.format("%s%n",p5_to_p6);
        System.out.format("%s%n",p6_to_p5);

        // Iterating over path elements (Path implements iterable)
        for(Path name : path) System.out.println(name);

        // Equals method
        Path otherPath = p4;
        Path beginning = Paths.get("/home");
        Path ending = Paths.get("foo");
        if (path.equals(otherPath)) {
            // equality logic here
        } else if (path.startsWith(beginning)) {
            // path begins with "/home"
        } else if (path.endsWith(ending)) {
            // path ends with "foo"
        }
    }
}
