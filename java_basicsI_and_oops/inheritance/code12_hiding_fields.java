// https://docs.oracle.com/javase/tutorial/java/IandI/hidevariables.html

class A {
    static int b = 10;
    int a = 3;
    int c = 99;
    String d;
}

class B extends A {
    static int b = 12;
    int a = 4;
    // Notice how super c variable gets hidden even if derived
    // c variable has different type
    double c = 1.0;
    {d = "hello";}  // Why does this work? and not without braces

    public void printSuperVars() {
        System.out.println(super.a);
        System.out.println(A.b);
        System.out.println(super.c);
        System.out.println(super.d);
    }

    public void printVars() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B();
        b.printVars();
        b.printSuperVars();
    }
}
