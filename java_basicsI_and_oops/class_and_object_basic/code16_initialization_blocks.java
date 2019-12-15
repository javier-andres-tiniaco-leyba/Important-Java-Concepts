// https://stackoverflow.com/questions/3987428/what-is-an-initialization-block
// https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

class Test {

    static int staticVariable;
    int nonStaticVariable;

    // Instance initialization block:
    // Runs each time you instantiate an object
    {
        System.out.println("Instance initialization.");
        nonStaticVariable = 7;
    }

    // Static initialization block:
    // Runs once (when the class is initialized)
    // static initialization blocks runs before instance initialization blocks
    // no matter the order
    static {
        System.out.println("Static initalization.");
        staticVariable = 5;
    }

    public Test() {
        System.out.println("Constructor.");
    }

    public static void main(String[] args) {
        new Test();
        new Test();
    }
}
