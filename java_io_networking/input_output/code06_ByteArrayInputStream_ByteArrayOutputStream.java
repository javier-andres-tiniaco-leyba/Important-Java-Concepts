import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ByteStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

        while(bOutput.size()!= 10) {
            // Gets the inputs from the user
            bOutput.write("hello".getBytes());
        }
        byte[] b = bOutput.toByteArray();
        System.out.println("Print the content");

        for(byte c : b) {
            // printing the characters
            System.out.format("%c ", c);
        }
        System.out.println();

        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting characters to Upper case " );

        while(( c = bInput.read())!= -1) {
            System.out.format("%c ",Character.toUpperCase((char)c));
        }
        System.out.println();
        bInput.reset();
    }
}
