import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;

class RedirectStdout {

    public static void main(String[] args) throws IOException {
        // Save system printStream for later reassignment
        PrintStream systemOutput = System.out;
        System.setOut(new PrintStream(new FileOutputStream("test.txt")));
        System.out.format("Hello file!%n");
        System.setOut(systemOutput);
        System.out.format("Hello stdout!%n");
    }
}
