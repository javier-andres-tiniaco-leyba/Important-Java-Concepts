import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionsExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        System.out.format("Initial collection value: %s%n",list);

        Collections.addAll(list, "Servlet","JSP");
        System.out.format("After adding elements collection value: %s%n",list);

        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.format("After adding array collection value: %s%n",list);
    }
}
