import java.io.File;

class Test {

   public static void main(String[] args) {
      File file = null;
      String[] paths;

      try {
         // create new file object
         file = new File(".");

         // array of files and directory
         paths = file.list();

         // for each name in the path array
         for(String path : paths) {
            // prints filename and directory name
            System.out.format("%s%n",path);
         }
      } catch (Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
}
