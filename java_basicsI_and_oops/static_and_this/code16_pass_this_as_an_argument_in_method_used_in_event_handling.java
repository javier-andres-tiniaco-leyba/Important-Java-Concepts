// Program of this keyword:
// The this keyword can also be passed as an argument in the method.
// It is mainly used in event handling.

class Test {
    void m(Test test) {
        System.out.println("method is invoked");
    }

    void p() {
        m(this);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.p();
    }
}
