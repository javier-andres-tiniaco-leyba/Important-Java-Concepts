// interface
interface Message {
   String greet();
}

class MyClass {
   // method which accepts the object of interface Message
   public void displayMessage(Message m) {
      System.out.println(m.greet() +
         ", This is an example of anonymous inner class as an argument");
   }

   public static void main(String[] args) {
      // Instantiating the class
      MyClass obj = new MyClass();

      // Passing an anonymous inner class as an argument
      obj.displayMessage(new Message() {
         public String greet() {
            return "Hello";
         }
      });
   }
}

// Delete public modifier at line 19 and see the error that pops up
