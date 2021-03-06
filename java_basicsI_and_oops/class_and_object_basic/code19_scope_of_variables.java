// Scope of a variable is the part of the program
// from which the variable is accessible. Like C/C++,
// in Java, all identifiers and lexically (or statically)
// scoped, I.E. the scope of a variable can be determined
// at compile time.


// - Member variables: defined inside class outside method
// - Local variables: defined within methods. They do not exist
//                    after method execution is over.

class Test  {

    static  int x = 11;
    private int y = 33;

    public void method1(int x) {
        Test t = new Test();
        Test.x = 22;
        y = 44;

        System.out.println("Test.x: " + Test.x);
        System.out.println("t.x: " + t.x);
        System.out.println("this.x: " + this.x);
        System.out.println("t.y: " + t.y);
        System.out.println("this.y: " + this.y);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.method1(5);
    }
}
