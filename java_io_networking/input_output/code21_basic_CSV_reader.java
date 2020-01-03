import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CSVReader {

	static final boolean headers = false;
    static final String  csvFile = "country.csv";
    static final String  csvSplitBy = ",";

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			if(headers) br.readLine();

            String  line = "";
			while((line = br.readLine()) != null) {
				String[] country = line.split(csvSplitBy);
				System.out.format(
                    "Country{code=%s, name=%s}%n",country[4],country[5]);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
