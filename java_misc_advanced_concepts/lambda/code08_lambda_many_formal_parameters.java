// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.htmlclass Calculator {

class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a,b);
    }

    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        IntegerMath addition = (a,b) -> a + b;
        IntegerMath substraction = (a,b) -> a - b;
        System.out.print("30 + 1 = " +
            myApp.operateBinary(30,1,addition));
        System.out.print("19 - 2 = " +
            myApp.operateBinary(19,2,substraction));
    }
}
