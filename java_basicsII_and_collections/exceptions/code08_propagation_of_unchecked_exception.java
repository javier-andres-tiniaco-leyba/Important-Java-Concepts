// By default Unchecked Exceptions are forwarded in calling
// chain (propagated). Notice how method m() generates an
// exception that is propagated up the call stack until
// a try-catch block handles it.

class TestExceptionPropagation1 {
    void m() {
        int data=50/0;
    }

    void n() {
        m();
    }

    void p() {
        try{
            n();
        } catch(ArithmeticException e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        TestExceptionPropagation1 obj = new TestExceptionPropagation1();
        obj.p();
        System.out.println("normal flow...");
    }
}
