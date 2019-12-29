// https://docs.oracle.com/javase/tutorial/java/IandI/override.html

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    public void callSuperInstanceMethod() {
        super.testInstanceMethod();
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        // This method can not be called using an Animal reference type
        // even though the object is a Cat instance
        // myAnimal.callSuperInstanceMethod();

        Cat.testClassMethod();
        myCat.testInstanceMethod();
        myCat.callSuperInstanceMethod();

    }
}
