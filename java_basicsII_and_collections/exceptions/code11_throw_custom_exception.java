class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException("My custom Exception demo.");
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
