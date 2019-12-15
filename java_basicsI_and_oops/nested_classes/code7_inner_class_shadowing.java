// https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

class ShadowingExample {

    int x = 0;

    class InnerClass {
        int x = 1;
        void insideInnerClass(int x) {
            System.out.println("Method inside InnerClass");
            System.out.println("x: " + x);
            System.out.println("this.x: " + this.x);
            System.out.println("ShadowingExample.this.x: " + ShadowingExample.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowingExample st = new ShadowingExample();
        ShadowingExample.InnerClass sti = st.new InnerClass();
        sti.insideInnerClass(23);
    }

}
