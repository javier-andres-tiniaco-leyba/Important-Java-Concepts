// Java program to demonstrate working of Comparator
// interface
import java.util.Arrays;
import java.util.Comparator;
// import java.io.*;

// A class to represent a student.
class Student {
	int rollno;
	String name;
    String address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return String.format("%s,%s,%s",rollno,name,address);
	}
}

class SortByRoll implements Comparator<Student> {
	// Used for sorting in ascending order of roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

// Driver class
class Main {
	public static void main(String[] args) {
		Student[] arr = {
            new Student(11, "John",   "london"),
			new Student(33,  "Sarah",  "orinoco"),
			new Student(22,  "Jamie",  "kuwait")
        };

		System.out.println("Unsorted");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		Arrays.sort(arr, new SortByRoll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
