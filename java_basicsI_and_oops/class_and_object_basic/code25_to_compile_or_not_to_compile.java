class Test {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}

// - In general, a set of curly braces {} defines a scope
// - For a variable to be read after the termination of the loop,
//   it must be declared before the body of the loop.
