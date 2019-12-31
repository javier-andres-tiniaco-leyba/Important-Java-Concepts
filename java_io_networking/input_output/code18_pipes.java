import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class PipeExample {

    public static void main(String[] args) throws IOException {

        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream  input  = new PipedInputStream(output);


        Thread thread1 = new Thread(()->
                    {
                        try {
                            output.write("Hello world, pipe!".getBytes());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        Thread thread2 = new Thread(() ->
                {
                    try {
                        while(input.available() != 0){
                            System.out.format("%c",input.read());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println();
                });

        thread1.start();
        thread2.start();
    }
}
