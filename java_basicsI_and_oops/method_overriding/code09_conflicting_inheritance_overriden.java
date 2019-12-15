// If two or more independently defined default methods conflict,
// or a default method conflicts with an abstract method, then the
// java compiler produces a compile error.
// One must explicitly override the supertype methods.

interface OperateCar {
    // ...
    default public int startEngine(int key) {
        // implementation
        return 0;
    }
}
interface FlyCar {
    // ...
    default public int startEngine(int key) {
        // Implementation
        return 0;
    }
}

// A class that implements both OperateCar and FlyCar must override
// the conflicting startEngine method. One could invoke any of the
// default implementations with the super keyword.

class FlyingCard implements FlyCar, OperateCar {
    // ...
    // Try commenting the method below and compiling
    public int startEngine(int key) {
        FlyCar.super.startEngine(key);
        OperateCar.super.startEngine(key);
        return 0;
    }
}

// The name preceeding super must refer to a direct superinterface that
// defines or inherits a default for the invoked method.
// This form of method invocation is not restricted to differentiating
// between multiple implemented interfaces that contain default methods
// with the same signature. You can use the super keyword to invoke a default
// method in both classes and interfaces.
