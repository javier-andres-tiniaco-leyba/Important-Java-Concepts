interface Animal {}

class Mammal implements Animal {}

class Dog extends Mammal {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(m instanceof Mammal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Dog);
    }
}
