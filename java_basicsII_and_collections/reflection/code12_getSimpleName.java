// Java program to demonstrate getSimpleName() method
// Returns the name of the underlying class as given in the source code
class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object for the class
		// with the specified name
		Class c1 = Class.forName("java.lang.String");

		System.out.print("Class Name associated with c : ");
		// returns the name of the class getName method
		System.out.println(c1.getName());

		System.out.print("Simple class Name associated with c : ");
		// returns the simple name of the class getSimpleName method
		System.out.println(c1.getSimpleName());
	}
}
