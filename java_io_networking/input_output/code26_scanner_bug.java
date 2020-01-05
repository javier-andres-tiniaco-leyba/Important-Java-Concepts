import java.util.Scanner;

class ScannerBug {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = in.nextInt();
        // Comment out next line to correct
        // in.nextLine(); // read the newline
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.format("Hello %s, age %d%n", name, age);
        in.close();
    }
}
