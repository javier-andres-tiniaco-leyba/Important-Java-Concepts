// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
// Abstract class needs to be extended and its method implemented.
// It cannot be instantiated.

abstract class Bank {
    abstract int getRateOfInterest();
}
class BBVA extends Bank{
    int getRateOfInterest() {
        return 7;
    }
}

class STD extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class TestBank{
    public static void main(String[] args) {
        Bank b;
        b = new STD();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new BBVA();  
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}
