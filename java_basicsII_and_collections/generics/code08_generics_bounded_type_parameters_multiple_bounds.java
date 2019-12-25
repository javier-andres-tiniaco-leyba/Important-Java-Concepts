class GenericsTester {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
            3,4,5, maximum(3,4,5));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
            6.6,8.8,7.7, maximum(6.6,8.8,7.7));
    }

    public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;   // assume x is initially the largest
        max = y.compareTo(max) > 0 ? y : max;
        max = z.compareTo(max) > 0 ? z : max;
        return max;
    }

    // Compiler throws error in case of below declaration
    // because class must go first in the type parameters
    /* public static <T extends Comparable<T> & Number> T maximum1(T x, T y, T z) {
        T max = x;
        max = y.compareTo(max) > 0 ? y : max;
        max = z.compareTo(max) > 0 ? z : max;
        return max;
        return max;
    }*/
}
