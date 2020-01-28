class UncheckedException {
    public static void main(String[] args) {
        int data=50/0;
        // ArithmeticException. Runtime Exception is an unchecked exception
        // and thus is not subject to the catch or specify requirement
        System.out.println("rest of the code...");
    }
}
