class Test {
    public static void main(String[] args) {
        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example with lambda
        Thread t2 = new Thread(()->System.out.println("Thread2 is running..."));
        t2.start();
    }
}
