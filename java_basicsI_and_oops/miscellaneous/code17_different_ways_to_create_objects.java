// Java program to illustrate creation of Object
// https://www.geeksforgeeks.org/different-ways-create-objects-java/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test implements Cloneable {

    String name = "Tiniaco Leyba";

    public Test(int i) {
        System.out.println("Constructor was called with int: "+i);
    }

    public Test() {
        System.out.println("No-argument constructor was called");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public static void main(String[] args) throws
            CloneNotSupportedException,
            InstantiationException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchMethodException {
		// Here we are creating Object of type Test using new keyword
        // the new keyword way is the most common one to create an Object
		Test t1 = new Test();
		System.out.println(t1.name);

        // This method creates an Object by calling the default constructor
        // of the class, so constructors with parameters can not be called.
        // Moreover, classes without no-argument constructor can NOT be
        // instantiated in this way. Notice that there is no need of typecasting
        // since the newInstance() method of class Class returns type T which is
        // the type of the type used to build the Class class
        Test t2 = Test.class.newInstance();
        System.out.println("type of t2: " + t2.getClass().getName());

        // Using clone method
        // Care must be taken with nested objects to avoid shallow copies.
        // Sometimes it is really hard to implement the clone method
        // correctly, since there are objects with a long chain of
        // inheritance, which makes it really hard to avoid shallow copies.
        // Unintended shallow copies can cause unexpected errors, such as logic
        // ones and hard to find bugs.
        Test t3 = (Test)t2.clone();

        // newInstance() method of Constructor class. This method is similar
        // to the one involving Class newInstance method, since reflection
        // is used to invoke a class constructor. Additionally, this method
        // allow for the invokation of constructors with parameters
        // For this to work, the constructor must be public
        Constructor c = Test.class.getConstructor(int.class);

        // typecast is needed because newInstane returns Object which can not
        // be assign to type Test
        Test t4 = (Test)c.newInstance(42);

        // Additionally, there is another method that involves de-serializing
	}
}
