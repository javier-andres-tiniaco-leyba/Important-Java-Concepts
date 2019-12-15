abstract class AnonymousInner {
   public abstract void myMethod();
}

class OuterClass {

   public static void main(String[] args) {
      // Assigment statement
      AnonymousInner inner = new AnonymousInner() {
         @Override
         public void myMethod() {
            System.out.println("This is an example of anonymous inner class");
         }
      };
      inner.myMethod();
   }
}
