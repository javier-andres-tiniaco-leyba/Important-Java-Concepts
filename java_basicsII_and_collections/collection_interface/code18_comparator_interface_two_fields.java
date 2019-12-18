// Java program to demonstrate working of Comparator
// interface more than one field

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student {
	String name;
	Integer age;

	// parameterized constructor
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Customer{name=%s, age=%s}",name,age);
	}

	static class CustomerSortingComparator implements Comparator<Student> {
		@Override
		public int compare(Student customer1, Student customer2) {
			int nameCompare = customer1.getName().compareTo(customer2.getName());
			int ageCompare = customer1.getAge().compareTo(customer2.getAge());
			// 2-level comparison using if-else
			return ageCompare == 0 ? nameCompare : ageCompare;
		}
	}

	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		al.add(new Student("troll", 27));
		al.add(new Student("Sara", 23));
		al.add(new Student("Tiniaco", 37));
		al.add(new Student("Pino", 22));
		al.add(new Student("Javier", 29));
		al.add(new Student("Andy", 22));
		al.add(new Student("Andy", 24));
		al.add(new Student("Pino", 21));
		al.add(new Student("Sara", 25));
		al.add(new Student("Sara", 24));
		al.add(new Student("Jorge", 22));

		Iterator<Student> custIterator = al.iterator();
		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(al, new CustomerSortingComparator());
		// after Sorting arraylist: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (Student customer : al) {
			System.out.println(customer);
		}
	}
}
