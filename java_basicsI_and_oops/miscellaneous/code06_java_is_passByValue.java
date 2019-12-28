// https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value?page=1&tab=votes#tab-top

// There is only call/pass by value in java
// Passing by value means that the value of the function parameter is copied
// into another location of your memory, and when accessing or modifying the
// variable within your function, only the copy is accessed/modified and the
// original value is left untouched.

class Operation {

    int data = 50;

    void change(int data) {
        //changes will be in the local variable only
        //data parameter shadows this.data variable
        data+=100;
    }

    public static void main(String[] args) {
        Operation op = new Operation();

        System.out.println(String.format("Before change %s",op.data));
        op.change(500);
        System.out.println(String.format("After change %s",op.data));
    }
}

// OUTPUT :
// before change 50
// after change 50
