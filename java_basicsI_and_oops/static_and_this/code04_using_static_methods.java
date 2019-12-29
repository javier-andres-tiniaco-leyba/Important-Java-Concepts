// Java static property is shared to all objects.
// It makes your program memory efficient (i.e it saves memory).
// Program of static variable. The static variable gets memory only
// once in class area at the time of class loading.

class Student9 {

    int rollno;
    String name;
    static String college = "ITS";

    static void change() {
        college = "BBDIT";
    }

    Student9(int r, String n) {
        rollno = r;
        name = n;
    }

    void display () {
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student9.change();

        Student9 s1 = new Student9 (111,"a");
        Student9 s2 = new Student9 (222,"b");
        Student9 s3 = new Student9 (333,"c");

        s1.display();
        s2.display();
        s3.display();
    }
}
