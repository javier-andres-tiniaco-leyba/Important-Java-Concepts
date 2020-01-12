// Typecasting example:
class TypecastingTest {

    public static void main(String[] args) throws InterruptedException {
        // Upcasting is performed implicitly
        int i = 100;
        long l = i;		// implicit typecasting
        float f = l;	// implicit typecasting
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

        // DownCasting is performed explicitly
        double d = 100.04;
        long L = (long)d;  // explicit typecasting
        int I = (int)L;    // explicit typecasting
        System.out.println("Double value "+d);
        System.out.println("Long value "+L);
        System.out.println("Int value "+I);

        System.out.println("1.0/3: " + 1.0/3);
        System.out.println("1/3: " + 1/3);
        System.out.println("1/3.0: " + 1/3.0);
        System.out.println("1 + 2.3: "+ (1+2.3));

        // Math class is available without importing it
        // Because java.lang package is imported by default
        System.out.println("Math.pow(2,3.1): " + Math.pow(2,3.1));

        // down casting
        System.out.println("Down cast 3.6 to int: " + (int)3.6);
    }
}