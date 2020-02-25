// If PersistentEcho is run with command line arguments, it prints out those arguments. It also saves the string printed out to a property, and saves the property to a file called PersistentEcho.txt
// If PersistentEcho is run with no command line arguments, it looks for an environment variable called PERSISTENTECHO. If that variable exists, PersistentEcho prints out its value, and also saves the value in the same way it does for command line arguments.
// If PersistentEcho is run with no command line arguments, and the PERSISTENTECHO environment variable is not defined, it retrieves the property value from PersistentEcho.txt and prints that out.

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PersistentEcho {

    private static String propFile = "PersistentEcho.txt";

    private static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {
        work(args);
    }

    public static void work(String[] args) throws IOException {
        if(args.length > 0) {
            savePersistentEchoVar(printArgs(args));
        } else {
            String envVar = System.getenv("PERSISTENTECHO");
            if(envVar != null) {
                System.out.println(envVar);
                savePersistentEchoVar(envVar);
            } else {
                prop.load(new FileInputStream(propFile));
                System.out.println(prop.getProperty("PERSISTENTECHO"));
            }
        }

    }

    private static void savePersistentEchoVar(String var) throws IOException {
        prop.setProperty("PERSISTENTECHO",var);
        prop.store(new FileOutputStream(propFile),"---Saved---");
    }

    private static String printArgs(String[] args) {
        StringBuilder st = new StringBuilder();
        String stSaved = null;
        for(String arg : args) {
            st.append(String.format("%s ",arg));
        }
        stSaved = st.toString().trim();
        System.out.println(stSaved);
        return stSaved;
    }

}
