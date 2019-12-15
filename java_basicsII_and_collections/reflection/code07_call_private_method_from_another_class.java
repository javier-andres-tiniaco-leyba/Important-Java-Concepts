// Access private method of a class from another class
// https://www.javatpoint.com/how-to-call-private-method-from-another-class-in-java

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
    public static void main(String[] args) throws
            InstantiationException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException {

        // This way of accesing a class is primarily used with
        // primitive types and the the class name is known
        Class c=A.class;
        //InstantiationException
        Object obj=c.newInstance();

        //NoSuchMethodException
        Method m=c.getDeclaredMethod("cube",new Class[]{int.class});
        m.setAccessible(true);
        // IllegalAccessException, InvocationTargetException
        m.invoke(obj,4);
    }
}

class A{
    private void cube(int n) {
        System.out.println(n*n*n);
    }
}

// Java Catch or specify requirement:
// Exceptions must be catch or be thrown
