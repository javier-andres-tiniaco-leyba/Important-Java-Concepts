// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// Multiple inheritance can be emulated in Java through
// a class by the implementation of multiple interfaces

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A7 implements Printable,Showable {
    public void print() {
        System.out.println("This is PRINT method.");
    }
    public void show() {
        System.out.println("This is SHOW method.");
    }

    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
