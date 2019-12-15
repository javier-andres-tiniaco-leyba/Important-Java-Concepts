// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// Static method from interfaces can be used without implementing the interface

// Default methods are instance methods in an interface for which
// the implementation must be provided.
// The implementation for static methods in interfaces must also be provided.

interface Drawable{
    void draw();

    static int cube(int x) {
        return x*x*x;
    }

    default String hello() {
        return "Hello";
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceStatic {
    public static void main(String[] args) {
        Drawable rec=new Rectangle();
        rec.draw();
        // Notice how static interface methods can be used through the
        // interface type, without implementing it.
        System.out.println(Drawable.cube(3));
        System.out.println(rec.hello());
    }
}
