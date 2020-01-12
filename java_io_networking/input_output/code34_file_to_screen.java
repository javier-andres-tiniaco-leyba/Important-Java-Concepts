import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// A simple disk-to-screen utility that demonstrates a FileReader.
class DtoS {
    public static void main(String[] args) {
        String s;
        BufferedReader br;
        FileReader fr;

        try {
            fr = new FileReader("test.txt");
            br = new BufferedReader(fr);
        } catch(FileNotFoundException exc) {
            System.out.println("Cannot open input file.");
            return;
        }

        try {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("Error reading file.");
        }

        try {
            fr.close();
        } catch(IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}