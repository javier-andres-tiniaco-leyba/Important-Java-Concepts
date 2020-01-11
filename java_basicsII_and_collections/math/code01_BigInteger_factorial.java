import java.math.BigInteger;

class BigFactorial {

	public static void main(String[] args) {
        System.out.format("Max value of long: %d%n", Long.MAX_VALUE);

        int i = 1;
        int n = 30;

		long resLong = 1;
		while(i<n) { //overflow
			System.out.format("factorial(%d)=%d%n",i,resLong);
            i++;
            resLong *= i;
        }

		BigInteger res = BigInteger.valueOf(1);
        i = 1;
		while(i<n) {
			System.out.format("factorial(%d)=%s%n",i,res);
            i++;
			res = res.multiply(BigInteger.valueOf(i));
		}
	}

}
