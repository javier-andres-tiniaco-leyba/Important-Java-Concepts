import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

class FileStreamTest {

    public static void main(String[] args) {

        InputStream is = null;
        OutputStream os = null;

        try {
            byte[] bWrite = {11,21,3,40,5};
            os = new FileOutputStream("test.txt");

            for(byte b : bWrite) {
                os.write(b);   // writes the bytes
            }
            os.close();

            is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
            System.out.println();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
