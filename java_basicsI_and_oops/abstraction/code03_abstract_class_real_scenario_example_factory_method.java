// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
// Abstract class needs to be extended and its method implemented.
// It cannot be instantiated.

abstract class Shape {
    abstract void draw();
}

// In real scenario, implementation is provided by others
// i.e. unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

//In real scenario, method is called by programmer or user
class TestAbstraction1 {
    public static void main(String[] args) {
        // In real scenario, object is provided through method
        // e.g. getShape() [factory] method
        Shape s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}
