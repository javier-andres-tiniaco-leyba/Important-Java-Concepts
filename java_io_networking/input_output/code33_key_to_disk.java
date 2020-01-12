// A simple key-to-disk utility that demonstrates a FileWriter.

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

class KtoD {
    public static void main(String[] args) {
        String str;
        FileWriter fw;
        BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));

        try {
            fw = new FileWriter("test.txt");
        } catch(IOException exc) {
            System.out.println("Cannot open file.");
            return;
        }

        System.out.println("Enter text 'stop' to quit.");

        try {
            do {
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                fw.write(String.format("%s%n",str));
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("Error writing to file.");
        }

        try {
            fw.close();
        } catch(IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}