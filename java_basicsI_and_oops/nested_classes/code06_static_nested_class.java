class Outer {
   static class NestedDemo {
      public void myMethod() {
         System.out.println("This is my static nested class");
      }
   }

   public static void main(String[] args) {
      Outer.NestedDemo nested = new Outer.NestedDemo();
      nested.myMethod();
   }
}
