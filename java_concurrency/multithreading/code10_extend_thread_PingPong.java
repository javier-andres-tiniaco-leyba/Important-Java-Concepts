// Book: The Java Programming Language 4th edition Arnold Gosling and Holmes 2005

class PingPong extends Thread {

    private String word;
    private int delay;

    public PingPong(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
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

    public static void main(String[] args){
        System.out.println("Main Thread Name: "+Thread.currentThread().getName());
        try{ sleep(3000); } catch (InterruptedException e) {e.printStackTrace();}
        new PingPong("ping", 200).start();
        new PingPong("Pong", 300).start();
        System.out.println("Main Thread Name: "+Thread.currentThread().getName());
    }

}
