import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

/**
 * This program demonstrates how to use the Console class to read a
 * password securely.
 */
class ConsoleLoginExample {

    public static void main(String[] args) throws IOException {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }

        console.format("Welcome to Java Expert Program!%n");
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");

        char[] correctPassword = {'1', '2', '3', '4'};

        if (Arrays.equals(password, correctPassword)) {
            console.format("Thanks %s, you are logged in.%n", name);
        } else {
            console.format("Sorry, you are denied.%n");
        }

        Arrays.fill(password, ' ');
        Arrays.fill(correctPassword, ' ');
    }
}
