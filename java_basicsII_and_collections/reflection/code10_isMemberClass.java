// Java program to demonstrate the methods:
// isAnonymousClass() ,isLocalClass() and isMemberClass() methods

class Test {
	// non-static nested class : Local class
	class A {}

	// static nested class
	static class B {}

	public static void main(String[] args) {
		// declaring an anonymous class
		Test t1 = new Test()
		{
			// class definition of anonymous class
		};

		// returns the Class object associated with t1 object
		Class c1 = t1.getClass();
		// returns the Class object associated with Test class
		Class c2 = Test.class;
		// returns the Class object associated with A class
		Class c3 = A.class;
		// returns the Class object associated with B class
		Class c4 = B.class;

		// checking for Anonymous class
		// isAnonymousClass method
		boolean b1 = c1.isAnonymousClass();
		System.out.println("is "+c1.toString()+" an anonymous class : "+b1);

		// checking for Local class
		// isLocalClass method
		boolean b2 = c2.isLocalClass();
		System.out.println("is "+c2.toString()+" a local class : " + b2);

		// checking for Member class
		// isMemberClass method
		boolean b3 = c3.isMemberClass();
		System.out.println("is "+c3.toString()+" a member class : " + b3);
	}
}
