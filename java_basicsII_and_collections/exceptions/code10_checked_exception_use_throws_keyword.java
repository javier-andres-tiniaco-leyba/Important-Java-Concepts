// Exception Handling is mainly used to handle the checked exceptions.
// If there occurs any unchecked exception such as NullPointerException,
// it is programmers fault because API is not being used correctly.

// Checked exceptions can be propagated by throws keyword

import java.io.IOException;

class TestThrows1 {
    void m() throws IOException {
        //checked exception
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try{
            n();
        } catch(IOException e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        TestThrows1 obj=new TestThrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}
