// Program of this keyword:
// Let's prove that this keyword refers to the current class instance variable.
// In this program, we are printing the reference variable and this,
// output of both variables are same.

class A5 {
    void m() {
        //prints same reference ID
        System.out.println(this);
    }

    public static void main(String[] args) {
        A5 obj = new A5();
        //prints the reference ID
        System.out.println(obj);
        obj.m();
    }
}
