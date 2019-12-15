class OuterDemo {
   // private variable of the outer class
   // This variable is effectively final since it is never modified
   private int num = 175;

   // Inner classes can access members of their enclosing class
   // inner class
   class InnerDemo {
      public int getNum() {
         System.out.println("This is the getnum method of the inner class:");
         return num;
      }
   }
}

class MyClass {

  public static void main(String[] args) {
      // Instantiating the outer class
      OuterDemo outer = new OuterDemo();
      // Instantiating the inner class
      OuterDemo.InnerDemo inner = outer.new InnerDemo();
      System.out.println(inner.getNum());
   }
}
