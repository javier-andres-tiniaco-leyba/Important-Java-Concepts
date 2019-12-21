import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<Character> mylist = new ArrayList<Character>();
        mylist.add('\b'); // backspace ?
        mylist.add('\t'); // tab
        mylist.add('\n'); // line feed
        mylist.add('\f'); // form feed ?
        mylist.add('\r'); // carriage return ?
        mylist.add('\"'); // double quote
        mylist.add('\''); // single quote
        mylist.add('\\'); // backslash

        for (Character c : mylist) {
            System.out.print("a" + c);
        }
    }
}
