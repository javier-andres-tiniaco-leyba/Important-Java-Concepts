/*
Compare two files.
To use this program, specify the names
of the files to be compared on the command line.
java CompFile FIRST.TXT SECOND.TXT
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CompFiles {

    public static void main(String[] args) {
        // First make sure that both files have been specified.
        if(args.length !=2) {
            System.err.println("ERROR: usage CompFile f1 f2");
            return;
        }
        fileCompare(args[0], args[1]);
    }

    private static void fileCompare(String file1, String file2) {
        FileInputStream f1;
        FileInputStream f2;

        try { // open first file
            f1 = new FileInputStream(file1);
        } catch(FileNotFoundException exc) {
            System.out.format("File Not Found: %s%n", file1);
            return;
        }

        try { // open second file
            f2 = new FileInputStream(file2);
        } catch(FileNotFoundException exc) {
            System.out.format("File Not Found: %s%n", file2);
            // Close the first file if the second file cannot be opened.
            closeFile(f1);
            return;
        }

        try { // Compare files.
            int i=0, j=0;
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            } while(i != -1 && j != -1);
            if(i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch(IOException exc) {
            System.err.println("File Error");
            System.exit(-1);
        } finally {
            closeFile(f1);
            closeFile(f2);
        }
    }

    private static void closeFile(FileInputStream fis) {
        try { // close second file
            fis.close();
        } catch(IOException exc) {
            System.out.format("Error closing: %s%n ", fis);
        }
    } // end closeFile
} // end class
