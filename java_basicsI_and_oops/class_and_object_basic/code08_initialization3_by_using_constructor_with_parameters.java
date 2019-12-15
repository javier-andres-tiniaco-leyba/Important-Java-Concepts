// Constructor in java is a special type of method
// that is used to initialize the object.
// A constructor that have no parameter
// is known as default constructor.

class Student4 {
    int id;
    String name;

    Student4(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(111,"John");
        Student4 s2 = new Student4(222,"Doe");
        s1.display();
        s2.display();
   }
}
