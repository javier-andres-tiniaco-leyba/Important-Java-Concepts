class OuterClass {
    // instance method of the outer class
    void myMethod() {
        int num = 23;
        // method-local inner class -> local class
        class MethodInnerDemo {
            public void print() {
                System.out.println("This is method inner class "+ num);
            }
        } // end of inner class

        // Accessing the inner class
        MethodInnerDemo inner = new MethodInnerDemo();
        inner.print();
        // Uncomment to get error: local variables referenced from an inner class
        // must be final or effectively final
        // num = 43;
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
}
