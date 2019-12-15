// Java program to demonstrate isAnnotation() method

// declaring an Annotation Type
@interface A {
	// Annotation element definitions
}

// Note that if isAnnotation() returns true then isInterface will also
// return true since annotations are a king of interfaces
class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		// returns the Class object associated with A annotation
		Class c1 = A.class;
		// returns the Class object associated with Test class
		Class c2 = Test.class;

		// checking for annotation type
		// isAnnotation method
		boolean b1 = c1.isAnnotation();
		boolean b2 = c2.isAnnotation();

		System.out.println("A was declared as an annotation.");
		System.out.println("is "+c1.toString()+" an annotation : " + b1);
		System.out.println("is "+c1.toString()+" an interface  : " + b1);
		System.out.println("is "+c2.toString()+" an annotation : " + b2);
	}
}
