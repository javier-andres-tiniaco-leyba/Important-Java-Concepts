// Java program to demonstrate getSuperclass() method

// base class
class A {}

// derived class
class B extends A {}

// Driver class
class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object associated with Test class
		Class myClass = Test.class;

		// returns the Class object for the class
		// with the specified name
		Class c1 = Class.forName("A");
		Class c2 = Class.forName("B");
		Class c3 = Class.forName("java.lang.Object");

		// getSuperclass method returns the superclass of the class represented
		// by this class object
		System.out.print("Test superclass : "); 
		System.out.println(myClass.getSuperclass());

		System.out.print("A superclass : ");
		System.out.println(c1.getSuperclass());

		System.out.print("B superclass : ");
		System.out.println(c2.getSuperclass());

		System.out.print("Object superclass : ");
		System.out.println(c3.getSuperclass());
	}
}
