interface BinaryOperation {
    int calculate(int a,int b);
}

class Test {
    public static void main(String[] args) {
        // Multiple parameters in lambda expression
        BinaryOperation op1 = (a,b) -> a+b;
        System.out.println(op1.calculate(10,20));

        // Multiple parameters with data type in lambda expression  (optinal)
        BinaryOperatione op2 = (int a,int b) -> a+b;
        System.out.println(op2.calculate(100,200));
    }
}
