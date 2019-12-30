import java.io.File;

class FileDemo {

    public static void main(String[] args) {
        File f = null;
        String[] strs = {"test1.txt", "test2.txt"};

        try {
            // for each string in string array
            for(String s : strs) {
                // create new file
                f = new File(s);

                // true if the file is executable
                boolean bool = f.canExecute();

                // find the absolute path
                String a = f.getAbsolutePath();

                // prints absolute path
                System.out.format("%s is executable: %s%n",a,bool);
            }
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
