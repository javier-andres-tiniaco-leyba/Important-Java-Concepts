class BasicRecursion {

    public static void main(String[] args) throws InterruptedException {
        countDown(5);
        nLines(4);
    }

    public static void nLines (int n) {
        if (n > 0) {
            System.out.println("");
            nLines(n - 1);
        }
    }

    // Recursion example 2
    public static void countDown (int n) throws InterruptedException {
        Thread.currentThread().sleep(400);
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

}
