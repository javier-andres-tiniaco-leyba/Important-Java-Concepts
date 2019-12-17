// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html
// T newIsntance(): this method creates a new instance of the class
// represented by this Class object. The class is created as if by
// a new expression with an empty argument list. The class is
// initialized if it has no been.

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) throws
                         ClassNotFoundException,
                         InstantiationException,
                         IllegalAccessException {
        // returns the Class object for this class
        Class myClass = Class.forName("Test");

        // creating new instance of this class
        // newInstance method
        Object obj = myClass.newInstance();

        // Type casting is needed because newInstance() returns
        // Object in this case, there is no way the compiler can know that
        // the object is of type Test, and since Test is NOT a super
        // class of Object, the assignment would not work without casting
        // object to Test type.
        Test test = (Test)myClass.newInstance();

        // In this case there is no need to for casting since ArrayList
        // implements List, which is equivalent to a superclass-class
        // relationship
        List list = ArrayList.class.newInstance();

        // returns the runtime class of obj
        System.out.println("Class of obj : " + obj.getClass());

        // obj.sayHello();
        test.sayHello();
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
