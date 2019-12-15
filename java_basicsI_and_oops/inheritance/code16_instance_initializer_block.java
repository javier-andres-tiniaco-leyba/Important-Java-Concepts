// https://www.javatpoint.com/instance-initializer-block

class A {
    A() {
        System.out.println("A constructor is called");
    }
    {System.out.println("A initializer block is called");}
}

class B extends A {

    // Initializer blocks get called in order of declaration
    {System.out.println("B first initializer block is called");}

    B() {
        // If the super line is commented, the compiler would introduce
        // it and the superclass constructor would be called anyway
        // super();
        // Initializer blocks are introduced just after a call to super()
        // by the compiler in the constructor of the class
        System.out.println("B constructor is called");
    }

    {System.out.println("B second initializer block is called");}
}

class Test {
    public static void main(String[] args) {
        new B();
    }
}
