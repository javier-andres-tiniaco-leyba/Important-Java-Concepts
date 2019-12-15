// One more example with index out of bound
import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		ArrayList<String> lis = new ArrayList<>();
		lis.add("My");
		lis.add("Name");
		System.out.println(lis.get(2));
	}
}
