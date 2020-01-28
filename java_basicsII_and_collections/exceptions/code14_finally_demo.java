// No matter how the try block is exited, the finally block is executed.

class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];
        System.out.format("Receiving %s%n", what);
        try {
            switch(what) {
                case 0:
                    t = 10 / what; // generate div-by-zero error
                    break;
                case 1:
                    nums[4] = 4;   // generate array index error.
                    break;
                case 2:
                    return;        // return from try block
            }
            System.out.println("This will never be executed!");
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by Zero!");
            return; // return from catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
        } finally {
            System.out.println("Leaving try.");
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {
        for(int i=0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    System.out.println(
    "No matter how the try block is exited, the finally block is executed.");
    }
}
