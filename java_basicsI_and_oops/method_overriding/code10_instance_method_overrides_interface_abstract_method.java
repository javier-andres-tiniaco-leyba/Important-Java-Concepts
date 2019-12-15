// Inherited instance methods from classes can override abstract interface
// methods.

interface Mammal {
    String identifyMySelf();
}

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
class Mustang extends Horse implements Mammal {
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }
}
