// Java program to demonstrate getTypeParameters() method
// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html

import java.lang.reflect.TypeVariable;

class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.util.Set");
        // getting array of TypeVariable for myClass object
        TypeVariable[] tv = c.getTypeParameters();
        System.out.println("TypeVariables in "+c.getName()+" class : ");

        // iterating through all TypeVariables
        for (TypeVariable typeVariable : tv) {
            System.out.println(typeVariable);
        }
    }
}
