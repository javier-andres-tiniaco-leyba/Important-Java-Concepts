class Bike9 {
    //final variable
    final int speedlimit=90;

    void run() {
        speedlimit=400;
    }

    public static void main(String[] args) {
        Bike9 obj = new Bike9();
        // ERROR : COMPILE TIME ERROR , final variables are inmutable
        // Can not assign a value to a final variable
        obj.run();
    }
}
