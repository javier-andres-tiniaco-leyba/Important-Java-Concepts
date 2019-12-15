// Java program to convert a ArrayList to an array
// using get() in a loop.
import java.util.List;
import java.util.ArrayList;

class Test {
	public static void main (String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		int[] arr = new int[al.size()];

		// ArrayList to Array Conversion
		for (int i =0; i < al.size(); i++)
			arr[i] = (int)al.get(i); // Casting Integer to int

		for (Integer x : arr)
			System.out.print(x + " ");
	}
}
