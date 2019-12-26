interface BinaryOperation {
    int calculate(int a,int b);
}

class Test {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        BinaryOperation op1 = (a,b) -> a+b;
        System.out.println(op1.calculate(10,20));

        // Lambda expression with return keyword.
        BinaryOperatione op2 =(int a,int b) -> {return (a+b);};
        System.out.println(op2.calculate(100,200));  
    }
}
