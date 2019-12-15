// Java program to illustrate creation of Object
// https://www.geeksforgeeks.org/different-ways-create-objects-java/
public class Test implements Cloneable {

    String name = "Tiniaco Leyba";

    public void Test(int i) {
        System.out.println("Constructor was called with int: ".concat(i));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public static void main(String[] args) {
		// Here we are creating Object of type Test using new keyword
        // the new keyword way is the most common one to create an Object
		Test t1 = new Test();
		System.out.println(t1.name);

        // This method creates an Object by calling the default constructor
        // of the class, so constructors with parameters can not be called.
        // Moreover, classes without no-argument constructor can NOT be
        // instantiated in this way
        Test t2 = Test.getClass().newInstance();

        // Using clone method
        // Care must be taken with nested objects to avoid shallow copies.
        // Sometimes it is really hard to implement the clone method
        // correctly, since there are objects with a long chain of
        // inheritance, which makes it really hard to avoid shallow copies.
        // Unintended shallow copies can cause unexpected erros, such as logic
        // ones and hard to find bugs.
        Test t3 = t2.clone();

        // newInstance() method of Constructor class. This method is similar
        // to the one involving Class newInstance method, since reflection
        // is used to invoke a class constructor. Additionally, this method
        // allow for the invokation of constructors with parameters
        java.lang.reflect.Constructor c =
            Test.getClass.getConstructor(int.class);

        Test t4 = c.newInstance(42);

        // Additionally, there is another method that involves de-serializing
	}
}
