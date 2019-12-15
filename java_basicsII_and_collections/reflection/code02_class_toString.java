// Java program to demonstrate toString() method
class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object for the class
		// with the specified name
        // If only "String" as class name is specified
        // ClassNotFoundException is thrown
		Class c1 = Class.forName("java.lang.String");
		Class c2 = int.class;
		Class c3 = void.class;
		Class c4 = String.class;

		System.out.print("Class represented by c1: ");
		System.out.println(c1.toString());

		System.out.print("Class represented by c2: ");
		System.out.println(c2.toString());

		System.out.print("Class represented by c3: ");
		System.out.println(c3.toString());

		System.out.print("Class represented by c4: ");
		System.out.println(c4.toString());
	}
}
