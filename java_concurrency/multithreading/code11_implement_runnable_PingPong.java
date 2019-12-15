class PingPongRunnable implements Runnable {

    private String word;
    private long delay;

    PingPongRunnable(String word,long delay) {
        this.word = word;
        this.delay = delay;
    }

    public void run() {
        try {
            while(true) {
                System.out.print(word + " ");
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        Runnable ping = new PingPongRunnable("Ping", 200);
        Runnable pong = new PingPongRunnable("Pong", 300);
        new Thread(ping).start();
        new Thread(pong).start();
    }
}
