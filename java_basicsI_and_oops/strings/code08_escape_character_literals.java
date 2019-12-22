// https://stackoverflow.com/questions/3091524/what-are-carriage-return-linefeed-and-form-feed
import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Character> mylist = new ArrayList<Character>();
        mylist.add('\b'); // backspace
        mylist.add('\t'); // tab
        mylist.add('\n'); // line feed
        mylist.add('\f'); // form feed
        mylist.add('\r'); // carriage return
        mylist.add('\"'); // double quote
        mylist.add('\''); // single quote
        mylist.add('\\'); // backslash

    // Backspace moves the cursor back 1 space
    // Notice how the letter a is overriten by x due to backspace
    System.out.println("\nBacksapce:\nca\bx\n");

    // Carriage return overrites
    System.out.println("Carriage return:\n0000aco\rTini\n");

    // Form feed
    System.out.println("Form feed:\n1\f2\f3\n");
    }
}
