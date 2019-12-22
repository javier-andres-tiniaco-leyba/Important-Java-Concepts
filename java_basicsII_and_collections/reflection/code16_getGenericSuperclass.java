// Java program to demonstrate
// getGenericSuperclass() method
class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object associated with Test class
		Class myClass = Test.class;
		Class c1 = Class.forName("java.util.ArrayList");
		Class c3 = Class.forName("java.lang.Object");

		// getGenericSuperclass method returns the generic
		// superclass of the class represented by this class object
		System.out.print("Test superclass : ");
		System.out.println(myClass.getGenericSuperclass());

		System.out.print("ArrayList superclass : ");
		System.out.println(c1.getGenericSuperclass());

		System.out.print("Object superclass : "); 
		System.out.println(c3.getGenericSuperclass());
	}
}
