// Java program to demonstrate working of Comparator interface
// https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;

class Test {
	public static void main (String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted:");
        printCollection(ar);

		Collections.sort(ar, new SortByRoll());

		System.out.println("\nSorted by rollno:");
        printCollection(ar);

		Collections.sort(ar, new SortByName());

		System.out.println("\nSorted by name:");
        printCollection(ar);

        Collections.sort(ar, new SortByAdress());

        System.out.println("\nSorted by adress:");
        printCollection(ar);
	}

    public static void printCollection(Collection c) {
        System.out.println("Printing collection: ");
        for(Object o : c)
            System.out.println(o);
    }
}

// A class to represent a student.
class Student {
	int rollno;
	String name;
    String address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

    @Override
	public String toString() {
		return String.format("%s %s %s",rollno, name, address);
	}
}

class SortByRoll implements Comparator<Student> {
	// Used for sorting in ascending order of roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

class SortByAdress implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.address.compareTo(b.address);
	}
}

class SortByName implements Comparator<Student> {
	// Used for sorting in ascending order of roll name
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}
