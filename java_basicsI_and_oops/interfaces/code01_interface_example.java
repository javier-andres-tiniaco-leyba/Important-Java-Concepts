// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// An interface declaration can contain method signatures, static methods,
// default methods and constant definitions. The only methods that have
// an implementation are default and static methods.

// A class that implements an interface must implement all the methods declared
// in the interface, except for those declared as static or default.

// An interface name can be used anywhere a type can be used.

interface printable {
    void print();
}

class A6 implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
