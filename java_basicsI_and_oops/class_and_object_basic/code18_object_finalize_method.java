
// Since no references are held for new created A instances,
// the garbage collector calls the finalize method.

// Careful! this program keeps running unti segmentation fault
// because it can not garbage collect objects fast enough

class A {
    @Override
    protected void finalize() {
        System.out.println("I got destroyed!");
    }

    void print() {
        System.out.println("I am still alive!");
    }

    public static void main(String[] args) {
        while(true) {
            new A();
        }
        // We can manually call this method
        // if while loop is not commented: compile-time error: unreachable stm
        // A a = new A();
        // a.print();
        // a.finalize();
        // a.print();
    }

}
