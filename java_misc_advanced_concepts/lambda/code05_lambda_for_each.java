import java.util.List;

class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.forEach(n -> System.out.println(n));
    }
}
