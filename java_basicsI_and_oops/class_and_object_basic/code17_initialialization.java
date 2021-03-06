
class A {
    A() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class B extends A {

    static int staticVariable2 = 123456;
    static int staticVariable;

    static {
        System.out.println(staticVariable2);
        System.out.println("Static Initialization block");
        staticVariable = Math.round(3.5f);
    }

    int instanceVariable;

    {
        System.out.println("Initialization block");
        instanceVariable = Math.round(3.5f);
        staticVariable = Math.round(3.5f);
    }

    B() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
        System.out.println("main");
    }

    void print() {
        System.out.println(instanceVariable);
    }

    static void somethingElse() {
        System.out.println("Static method");
    }
}
