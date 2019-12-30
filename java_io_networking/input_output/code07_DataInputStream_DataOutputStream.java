import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class DataInputStreamDemo {

    public static void main(String[] args) throws IOException {

        DataOutputStream dataOut = null;
        DataInputStream dataIn = null;
        try {
            // writing string to a file encoded as modified UTF-8
            dataOut = new DataOutputStream(
                new FileOutputStream("file.txt"));

            dataOut.writeUTF("hello, nice to meet you!");

            // Reading data from the same file
            dataIn = new DataInputStream(
                new FileInputStream("file.txt"));

            while(dataIn.available()>0) {
                String k = dataIn.readUTF();
                System.out.print(k+" ");
            }
        } finally {
            System.out.format("%n%n");
            dataIn.close();
            dataOut.close();
        }
    }
}
