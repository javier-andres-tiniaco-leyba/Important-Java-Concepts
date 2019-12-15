// this program throws COMPILE TIME ERROR
// Final classes can not be extended
// Error: Can not inherit from final class

final class Bike {}

class Honda1 extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
        Honda1 honda = new Honda1();
        honda.run();
    }
}
