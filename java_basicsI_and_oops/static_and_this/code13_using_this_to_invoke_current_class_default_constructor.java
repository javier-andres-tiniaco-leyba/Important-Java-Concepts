// Program of this keyword: to invoke current class default constructor!
// When "this" is used to call a constructor, it must be the first statement.

class A{
    A() {
        System.out.println("hello a");
    }

    A(int x) {
        this();
        System.out.println(x);
    }
}

class TestThis5 {
    public static void main(String[] args) {
        A a = new A(10);
    }
}
