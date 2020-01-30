import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;

class ZipFileContents {

    public static void main(String[] args){
        try {
            writeToFileZipFileContents("test.zip","testzip.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFileZipFileContents(String zipFileName, String outputFileName) throws IOException {

        Charset charset = StandardCharsets.UTF_8;
        Path outputFilePath = Paths.get(outputFileName);

        // Open zip file and create output file with
        // try-with-resources statement

        try (
            ZipFile zf = new ZipFile(zipFileName);
            BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)) {
            // Enumerate each entry
            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                // Get the entry name and write it to the output file
                String zipEntryName = String.format("%s%n",((ZipEntry)entries.nextElement()).getName());
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }
}
