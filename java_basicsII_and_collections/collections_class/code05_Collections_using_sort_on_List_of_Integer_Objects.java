import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class TestSort2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(101));
        // internally will be converted into objects as Integer.valueOf(230)
        al.add(230);

        Collections.sort(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
