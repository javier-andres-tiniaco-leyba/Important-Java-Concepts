abstract class Shape {

    public static final double PI = 3.14;

    abstract void draw();

    public static void talk() {
        System.out.println("I am a shape");
    }
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
        // Notice how static member of an abstract class
        // can be used without implementing it
        Shape.talk();
        System.out.println(Shape.PI);
    }
}
