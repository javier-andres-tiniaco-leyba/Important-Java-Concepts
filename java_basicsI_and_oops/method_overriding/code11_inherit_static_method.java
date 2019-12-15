// Static methods in interfaces are never inherited. **

interface Mammal {
    String identifyMySelf();

    static void sayHello() {
        System.out.println("Hello");
    }
}

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
    public static void horseSayHello() {
        System.out.println("Horse says hello");
    }
}

class Mustang extends Horse implements Mammal {
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
        Mustang.horseSayHello();
        myApp.horseSayHello();
        // Error: can not find symbol. **
        Mustang.sayHello();
        myApp.sayHello();

    }
}
