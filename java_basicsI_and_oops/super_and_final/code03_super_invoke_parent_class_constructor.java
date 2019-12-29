class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        // This is unnecessary as parent default constructors
        // are always called implicitly
        super();
        System.out.println("dog is created");
    }
}

class TestSuper3 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
