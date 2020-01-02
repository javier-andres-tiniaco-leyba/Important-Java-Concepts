class NestedTryCatch {
    public static void main(String[] args) {
        // Here, numer is longer than denom.
        int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] denom = { 2, 0, 4, 4, 0, 8 };
        try {
            for(int i=0; i<numer.length; i++) {
                try {
                    System.out.format("%s/%s=%s%n",
                        numer[i],denom[i],numer[i]/denom[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Can't divide by Zero!");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
            System.out.println("Fatal error – program terminated.");
        }
    }
}
