import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Write and then read back binary data.
class RWData {
    public static void main(String[] args) {
        DataOutputStream dataOut;
        DataInputStream dataIn;
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        String fileName = "test.txt";

        try {
            dataOut = new
            DataOutputStream(new FileOutputStream(fileName));
        } catch(IOException exc) {
            System.err.println("ERROR: Cannot open output file.");
            return;
        }

        try {
            System.out.format("Writing: %d, %f, %s, %f%n", i, d, b, 12.2*7.4);
            dataOut.writeInt(i);
            dataOut.writeDouble(d);
            dataOut.writeBoolean(b);
            dataOut.writeDouble(12.2 * 7.4);
        } catch(IOException exc) {
            System.err.println("ERROR: Write error.");
        } finally {
            try {
                dataOut.close();
            } catch(IOException exc) {
                System.err.println("ERROR: could not close output file.");
            }
        }

        try {
            dataIn = new DataInputStream(new FileInputStream(fileName));
        } catch(IOException exc) {
            System.out.println("Cannot open input file.");
            return;
        }

        try {
            i = dataIn.readInt();
            System.out.println("Reading " + i);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
            b = dataIn.readBoolean();
            System.out.println("Reading " + b);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
        } catch(IOException exc) {
            System.out.println("Read error.");
        } finally {
            try {
                dataIn.close();
            } catch(IOException exc) {
                System.err.println("ERROR: could not close input file.");
            }
        }
    }
}
