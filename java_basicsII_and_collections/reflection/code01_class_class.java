// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html
// https://www.geeksforgeeks.org/java-lang-class-class-java-set-1/


// java.lang.Class
// - Provides methods to get the metadata of a class at runtime
// - Provides methods to examine and change the run time behaviour of a class.

// There are three main ways to create a Class class
// 1- Myclass.class
// 2- Class.forName("className")
// 3- obj.getClass()

// The methods in any class in which the return type
// is the same as the class are called factory methods

class TestClassClass {
    public static void main(String[] args) throws ClassNotFoundException {
        String hello = "Hello";

        ClassTester.printClassName(hello);
        ClassTester.printClassName('1');
        ClassTester.printClassName(1);
        ClassTester.printClassName(1.0);
        ClassTester.printClassName(0xF);    // hexadecimal
        ClassTester.printClassName(0b0101); // binary

        Class c1 = ClassTester.class;
        Class c2 = Class.forName("TestClassClass");
        Class c3 = hello.getClass();
    }

    static class ClassTester {
        static void printClassName(Object obj) {
            System.out.println("The class of " + obj + " is " +
                obj.getClass().getName());
        }
    }
}
