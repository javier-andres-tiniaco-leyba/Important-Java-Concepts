// This gets huge rapidly wild, use small positive ints or pc might suffer
// execution: java Ackerman 2 2

/*
 * https://docs.oracle.com/javase/7/docs/api/java/lang/StackOverflowError.html
 * https://en.wikipedia.org/wiki/Ackermann_function
 */
class Ackerman {

    public static void main(String[] args) {

        long m = Long.parseLong(args[0]);
        long n = Long.parseLong(args[1]);
        long res = -1;

        try {
            res = calculate(m, n);
        } catch (StackOverflowError e) {
            System.err.println(
                    "ERROR: Stack overflow error occurred. Application recursed too deeply");
        }

        System.out.format("Ackerman(%d,%d)=%d%n",m,n,res);
    }

    public static long calculate(long m, long n) {
        if(m==0)
            return n + 1;
        else if(m>0 && n==0)
            return calculate(m-1,1);
        else if(m>0 && n>0)
            return calculate(m-1, calculate(m, n-1));
        else{
            System.out.println("Invalid values of m and or/n");
            return -1;
        }
    }

}
