// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

interface Bank {
    float rateOfInterest();
}

class Santander implements Bank {
    public float rateOfInterest() {
        return 2.7f;
    }
}

class BBVA implements Bank {
    public float rateOfInterest() {
        return 3.1f;
    }
}

class TestInterface2 {
    public static void main(String[] args) {
        Bank bbva = new BBVA();
        Bank std = new Santander();
        System.out.println("ROI: "+bbva.rateOfInterest());
        System.out.println("ROI: "+std.rateOfInterest());
    }
}
