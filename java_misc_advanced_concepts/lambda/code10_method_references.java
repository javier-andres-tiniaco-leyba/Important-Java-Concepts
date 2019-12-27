// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

import java.util.function.Supplier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

class Test {
    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 31, Person.Sex.MALE),
            new Person("Sara", 23, Person.Sex.FEMALE),
            new Person("Angel", 30, Person.Sex.MALE)
        };

        System.out.println("Before sorting:");
        printArray(people);
        // Arrays.sort(people, (p1,p2) -> Person.compareByAge(p1,p2));
        // Reference to static method from a particular type
        Arrays.sort(people, Person::compareByAge);
        System.out.println("After sorting:");
        printArray(people);

        String[] stringArray = { "Barbara", "James", "Mary", "John"};
        // Reference to an instance method of an
        // arbitrary object of a particular type
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        printArray(stringArray);

        // Reference to a constructor (method reference)
        HashSet<Person> peopleMoved = transferElement(
            Arrays.asList(people), HashSet<Person>::new);

        System.out.println(peopleMoved);
    }

    public static <E> void printArray(E[] arr) {
        for(E e : arr)
            System.out.println(e);
    }

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
        DEST transferElement(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for(T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}

class Person {

    public enum Sex {
        FEMALE,MALE;
    }

    Person(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String name;
    Integer age;
    Sex gender;

    public static int compareByAge(Person a, Person b) {
        return a.age.compareTo(b.age);
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }

    @Override
    public String toString() {
        return String.format("Person={name='%s',age=%s,gender=%s}",
            name,age,gender);
    }
}
