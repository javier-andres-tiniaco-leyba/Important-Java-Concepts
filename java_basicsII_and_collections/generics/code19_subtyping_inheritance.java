import java.util.List;
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3);
        // Compile error, since List<Integer> is not a subtype of List<Number>
        // even though Integer is a a subclass of Number.
        // List<Number> numList = intList;
        List<? extends Number> numList = intList;
        System.out.println(numList);
    }
}

// Wilcards must be used when subtyping generic classes
// https://docs.oracle.com/javase/tutorial/java/generics/subtyping.html
