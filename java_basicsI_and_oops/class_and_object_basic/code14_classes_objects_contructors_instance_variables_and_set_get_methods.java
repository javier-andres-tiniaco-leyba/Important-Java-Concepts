class Puppy {
   int puppyAge;

   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

   public void setAge(int age) {
       puppyAge = age;
   }

   public int getAge() {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String[] args) {
      // Declaration + instantiation + initilization of name through constructor
      Puppy myPuppy = new Puppy("tommy");

      // Call instance method to set puppy's age
      myPuppy.setAge(2);

      /// Call another instance method to get puppy's age
      myPuppy.getAge( );

      // You can access instance variable as follows as well 
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}
