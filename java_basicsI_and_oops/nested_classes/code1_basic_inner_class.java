class OuterDemo {
   int num;

   // inner class
   private class InnerDemo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }

   // Accessing the inner class from the method within
   void displayInner() {
      InnerDemo inner = new InnerDemo();
      inner.print();
   }
}

class MyClass {

   public static void main(String[] args) {
      // Instantiating the outer class
      OuterDemo outer = new OuterDemo();
      // Accessing the display_Inner() method.
      outer.displayInner();
   }
}
