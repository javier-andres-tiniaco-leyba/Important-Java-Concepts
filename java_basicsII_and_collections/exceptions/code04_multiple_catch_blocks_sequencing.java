// Exceptions must be ordered from most specific to general.
// This will not compile due to the wrong oredering of Exceptions.

class TestMultipleCatchBlock1 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        } catch(Exception e) {
            System.out.println("common task completed");
        } catch(ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        }
        System.out.println("rest of the code...");
    }
}
