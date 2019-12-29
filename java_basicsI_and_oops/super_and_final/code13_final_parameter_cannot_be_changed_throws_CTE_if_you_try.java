// THROWS Compile Time Error
// Method parameters can be declared final
// which means that they can not be changed

class Bike11 {
    int cube(final int n) {
        n+=2;//can't be changed as n is final
        return n*n*n;
    }

    public static void main(String[] args) {
        Bike11 b = new Bike11();
        b.cube(5);
    }
}
