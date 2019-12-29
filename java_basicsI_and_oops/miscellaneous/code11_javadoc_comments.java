// A doc comment is written in HTML and must precede a
// class, field, constructor or method declaration.
// https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html

package com.abc;

/** This class is a user-defined class that contains one method cube.
 * Javadoc comment for class.
 */
public class M {

    /** Javadoc comment for hello field.*/
    public static final String hello = "World";

    /** The cube method prints cube of the given number.
     * Javadoc comment for method.
     * @param n
     */
    public static void  cube(int n) {
        System.out.println(n*n*n);
    }

    /** Useless constructor. Javadoc comment for constructor. */
    public M() {
        System.out.println("Constructor called.");
    }
}
