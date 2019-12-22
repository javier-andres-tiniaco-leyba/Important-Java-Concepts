// Both instanceof operator and isInstance() method are used to check
// wheter an object is an instance of a class.  The main difference is that
// isInstance() method operates at runtime. (Dynamically)

// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html#isInstance-java.lang.Object-

// Java program to demonstrate working of isInstance() method
class Test {
	// This method tells us whether the object is an instance of class whose
    // name is passed as a string 'c'.
	public static boolean fun(Object obj, String c)
            throws ClassNotFoundException {
		return Class.forName(c).isInstance(obj);
	}

	// Driver code that calls fun()
	public static void main(String[] args)
					throws ClassNotFoundException {

		Integer i = new Integer(5);
		// print true as i is instance of class Integer
        System.out.println(i instanceof Integer);
		System.out.println(fun(i, "java.lang.Integer"));
        // print false as i is not instance of class String
        System.out.println(fun(i, "java.lang.String"));
        // print true as i is also instance of class Number as Integer class
        // extends Number class
        System.out.println(fun(i, "java.lang.Number"));

        // Error: instanceof operator left object must be of class right
        // System.out.println(i instanceof String);
	}
}
