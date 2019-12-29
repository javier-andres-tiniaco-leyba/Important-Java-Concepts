class ThisExample {

    // Instance variable num
    int num = 10;

    ThisExample() {
        System.out.println("This is an example program on keyword this");
    }

    ThisExample(int num) {
        // Invoking the default constructor
        this();
        // Assigning the local variable num to the instance variable num
        this.num = num;
    }

    public void greet() {
        System.out.println("Hi, Welcome to Java");
    }

    public void print() {
        // Local variable num
        int num = 20;

        // Printing the local variable
        System.out.println("value of local variable num is : "+num);

        // Printing the instance variable
        System.out.println("value of instance variable num is : "+this.num);

        // Invoking the greet method of a class
        this.greet();
    }

    public static void main(String[] args) {
        // Instantiating the class
        ThisExample obj1 = new ThisExample();
        obj1.print();

        ThisExample obj2 = new ThisExample(30);
        obj2.print();
    }
}
