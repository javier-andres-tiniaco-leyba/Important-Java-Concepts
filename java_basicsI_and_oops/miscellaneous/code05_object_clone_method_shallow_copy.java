// The clone() method is defined in the Object class.
// The java.lang.Cloneable interface must be implemented
// by the class whose object clone we want to create.
// If we don't implement Cloneable interface,
// clone() method generates CloneNotSupportedException.


// Notice how Object clone method creates a shallow copy
// of the object, that is, inner objects are referenced
// instead of new ones being created. That is tested with
// hashCode method, both name and rollno of s1 and s2
// share the same hashCodes wich means they point to the
// the same objects.

class Student implements Cloneable {

    Integer rollno;

    String name;

    Student(Integer rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            Student s1 = new Student(101,"John");

            Student s2 = (Student)s1.clone();

            System.out.println(s1);
            System.out.println(s2);

        } catch(CloneNotSupportedException c) {
            System.out.println(c.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("Student=%s, rollno:%s=%s, name:%s=%s",
            this.hashCode(),
            rollno, rollno.hashCode(),
            name, name.hashCode());
    }
}
