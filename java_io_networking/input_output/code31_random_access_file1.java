// Demonstrate random access files.
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;

class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        RandomAccessFile raf;

        try {
            raf = new RandomAccessFile("random.dat", "rw");
        } catch(FileNotFoundException exc) {
            System.out.println("Cannot find file.");
            return ;
        }

        try {// Write values to the file.
            for(double d: data) {
                raf.writeDouble(d);
            }

            // Now, read back specific values
            raf.seek(0); // seek to first double
            System.out.format("First value is %f%n", raf.readDouble());

            raf.seek(8); // seek to second double
            System.out.format("Second value is %f%n", raf.readDouble());

            raf.seek(8 * 3); // seek to fourth double
            System.out.format("Fourth value is %f%n%n", raf.readDouble());

            // Now, read every other value.
            System.out.println("Here is every other value: ");
            for(int i=0; i < data.length; i+=2) {
                raf.seek(8 * i); // seek to ith double
                System.out.format("%f%n",raf.readDouble());
            }
        } catch(IOException exc) {
            System.out.println("File error.");
        }

        try {
            raf.close();
        } catch(IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}
