// Static and instance initialization blocks are inserted
// implicitly by the compiler before any statement in the
// constructors.

class Bike8 {

    int speed;

    Bike8() {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    public static void main(String[] args) {
        Bike8 b1=new Bike8();
        Bike8 b2=new Bike8();
    }
}
