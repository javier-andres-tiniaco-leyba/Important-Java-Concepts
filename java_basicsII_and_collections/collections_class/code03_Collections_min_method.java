import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionsExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);

        System.out.format("Value of minimum element from the collection: %s%n",
            Collections.min(list));
    }
}
