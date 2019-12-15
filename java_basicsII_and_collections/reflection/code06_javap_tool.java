import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyJavap {
    public static void main(String[] args) throws Exception {
        Class c=Class.forName(args[0]);

        System.out.println("Fields........");
        Field f[] = c.getDeclaredFields();
        printArray(f);

        System.out.println("Constructors........");
        Constructor con[] = c.getDeclaredConstructors();
        printArray(con);

        System.out.println("Methods........");
        Method m[]=c.getDeclaredMethods();
        printArray(m);
    }

    public static void printArray(Object[] arr) {
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
    }
}
