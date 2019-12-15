// Java program to demonstrate isAssignableFrom() method
class Test extends Thread {
	public static void main(String[] args) throws
			ClassNotFoundException,
			InstantiationException,
			IllegalAccessException {
		// returns the Class object for this class
		Class myClass = Class.forName("Test");

		// returns the Class object for the class
		// with the specified name
		Class thr = Class.forName("java.lang.Thread");
		Class str = Class.forName("java.lang.String");

	// isAssignableFrom method on c1
	// it checks whether Thread class is assignable from Test
	boolean b1 = thr.isAssignableFrom(myClass);

	// isAssignableFrom method on c2
	// it checks whether String class is assignable from Test
	boolean b2 = str.isAssignableFrom(myClass);

	System.out.println("is Thread class Assignable from Test : " + thr);
	System.out.println("is String class Assignable from Test : " + str);
	}
}
