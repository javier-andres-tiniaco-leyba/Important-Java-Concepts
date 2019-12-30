import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        int words = 0;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));
            // s.useDelimiter(",\\s*");

            while (s.hasNext()) {
                System.out.println(s.next());
                words++;
            }
        } finally {
            if (s != null) {
                s.close();
                System.out.format("%nNumber of words: %d%n", words);
            }
        }
    }
}
