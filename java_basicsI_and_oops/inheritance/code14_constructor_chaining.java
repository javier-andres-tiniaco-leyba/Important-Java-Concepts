// https://docs.oracle.com/javase/tutorial/java/IandI/super.html

class A {
    A() {
        System.out.println("This is A");
    }
}

class B extends A {
    B() {
        System.out.println("This is B");
    }
}

class C extends B {
    C() {
        System.out.println("This is C");
    }
}

class D extends C {
    D() {
        System.out.println("This is D");
    }

    D(int a) {
        System.out.println("D constructor with an int parameter was called");
    }
}

// Notice how the chain of no-argument constructor is launch
// both when the derived class constructor have and do not have parameters.
class Test {
    public static void main(String[] args) {
        // Notice how every no-argument constructor gets called
        new D();
        new D(1);
    }
}
