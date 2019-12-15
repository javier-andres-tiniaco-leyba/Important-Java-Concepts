// Java program to demonstrate isInstance() method
// https://www.geeksforgeeks.org/different-ways-create-objects-java/
class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object for the class
		// with the specified name
		Class c = Class.forName("java.lang.String");

		String s = "GeeksForGeeks";
		int i = 10;

		// this method determines if the specified Object is
		// assignment-compatible with the object represented
		// byt this Class
		boolean b1 = c.isInstance(s);
		boolean b2 = c.isInstance(i);

		System.out.println("is s instance of String : " + b1);
		System.out.println("is i instance of String : " + b1);
	}
}
