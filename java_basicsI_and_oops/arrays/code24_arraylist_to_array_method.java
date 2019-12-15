// Java program to demonstrate working of
// Objectp[] toArray()
import java.util.List;
import java.util.ArrayList;

class Test {
	public static void main (String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] objects = al.toArray();

        // If the primitive integer data type was needed,
        // we would have to typecast object to integer

		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + " ");
	}
}
