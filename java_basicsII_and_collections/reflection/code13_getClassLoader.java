// Java program to demonstrate getClassLoader() method
class Test  {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for this class
        Class myClass = Class.forName("Test");
        Class c1 = Class.forName("java.lang.String");
        Class c2 = int.class;

        // getting the class loader for Test class
        // getClassLoader method on myClass
        System.out.print("Test class loader : ");
        System.out.println(myClass.getClassLoader());

        // getting the class loader for String class
        // we will get null as String class is loaded
        // by BootStrap class loader
        // getClassLoader method on c1
        System.out.print("String class loader : ");
        System.out.println(c1.getClassLoader());

        // getting the class loader for primitive int
        // getClassLoader method on c2
        System.out.print("primitive int loader : ");
        System.out.println(c2.getClassLoader());
        System.out.print("primitive void loader : ");
        System.out.println(void.class.getClassLoader());
    }
}

// This method returns the class loader for this class. If
// the class loader is bootstrap classloader then this method
// will return null, as bootstrap classloader is implemented
// in native languages like c,c++. If the object represents
// a primitive type of void, then null returned.
