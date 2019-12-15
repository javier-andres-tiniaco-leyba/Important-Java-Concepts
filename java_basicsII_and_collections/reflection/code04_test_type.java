class Simple {}

interface My {}

// The java catch of specify requirement mandates that in order
// from a program to compile, exceptions must be either specified
// to be thrown or caugth    

class Test{
    public static void main(String[] args) {
        try{
            Class c=Class.forName("Simple");
            System.out.println(c.isInterface());
            System.out.println(c.isArray());
            System.out.println(c.isEnum());

            Class c2=Class.forName("My");
            System.out.println(c2.isInterface());
        } catch (Exception e) { // Exception caugth
            System.out.println(e);
        }
    }
}
