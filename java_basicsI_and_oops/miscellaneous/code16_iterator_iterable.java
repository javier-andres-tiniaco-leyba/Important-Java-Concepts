// both Iterator and Iterable are java interfaces
// https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// Iterable is contained in the package java.lang
//  - Classes that implement Iterable must implement:
//      -  Iterator<T> iterator() method.
//      -  Classes that implement Iterable can be used
//         in a for-each loop (enhanced foor loop).
//      -  Since java 8 it is possible to call forEach() method
//      -  of an Iterable which performs an action of each
//         element of the Iterable. The default implementation of
//         forEach also used for-each loop internally.
//      -  An iterable represents a collection which can be traversed.
// Iterator is contained in the package java.util
//  - classes that implement Iterator must implement:
//      -  boolean next() method.
//      -  E hasNext() method.
//      -  Iterator takes the place of Enumeration in the java
//         Collections framework. Iterator differs from Enum
//         in two ways: 1. Iterators allow the caller to remove
//         elements from the underlying collection during the
//         iteration with well defined semantics. 2. Method
//         namesh has been improved.

// If a class implements the Iterable interface, it gains the ability
// to iterate over an object of that class using an Iterator.

// Both interfaces are tightly related since
// Iterable's iterator method must return an Iterator<T>.

// https://www.techiedelight.com/differences-between-iterator-and-iterable-in-java/
// https://docs.oracle.com/javase/8/docs/api/index.html
// both forEach and forEachRemaining accept objects whose class
// implements the functional interface Consumer<? super E>

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorIterableTest {

    public static void main(String[] args) {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
        while (iterator.hasNext()){
        	System.out.println(iterator.next());
        }

        // Since java 8 forEachRemaining:
        iterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
        iterator.forEachRemaining(System.out::println);

        List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(mylist);
        mylist.forEach(System.out::println);

        // Iterator instance method remove: remove the last element
        // returned from this iterator from the underlying collection
        for (Iterator<Integer> it = mylist.iterator(); it.hasNext();) {
            if (it.next() % 2 == 0) {
                it.remove(); // this throws an error because the method remove in List interface is abstract
            }
        }
        System.out.println(mylist);
    }
}
