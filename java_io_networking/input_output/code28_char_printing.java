// Read an array of bytes from the keyboard.
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class PrintChars {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("test.txt");
        DataOutputStream dOut = new DataOutputStream(file);
        for(int i=0x0000; i < 0x0FFF; i++) {
            dOut.writeUTF(String.format("0x%04x, %d : %c%n",i,i,i));
        }
        System.out.format("%n");
        dOut.close();
    }
}
