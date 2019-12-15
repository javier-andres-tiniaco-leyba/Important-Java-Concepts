// https://www.javatpoint.com/new-instance()-method
// https://docs.oracle.com/javase/8/docs/api/

import java.lang.reflect.Constructor;

class Simple {
    public Simple() {
        System.out.println("No-argument constructor was called.");
    }
    public Simple(int i) {
        System.out.println("Int argument constructor was called: " + i);
    }
    public Simple(String s) {
        System.out.println("String argument constructor was called: " + s);
    }
    public void message() {
        System.out.println("Hello Java");
    }
}

// Simple type is used as the type of both Class and Construtor, but if
// type were unkown, it could be omitted as in the examples in the
// other codes 01,02...
class Test {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Simple");
            // No-argument constructor is called
            Simple s = (Simple)cls.newInstance();
            s.message();

            Constructor<Simple> c1 = Simple.class.getConstructor(int.class);
            Constructor<Simple> c2 = Simple.class.getConstructor(String.class);
            c1.newInstance(42);
            c2.newInstance("Hello");

            s.getClass().getConstructor(int.class).newInstance(42);
            s.getClass().getConstructor(String.class).newInstance("Bye");
        } catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
