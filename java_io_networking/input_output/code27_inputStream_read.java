// Read an array of bytes from the keyboard.
import java.io.IOException;
import java.io.Console;

class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[4];

        // Only ASCII chars up to 127 can be stored in byte
        System.out.format("Byte min val: %d, max val: %d%n",
            Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.format("Char min val: %d, max val: %d%n",
            (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);

        // reads until array is full, the end of stream is reached
        // or error occurs.
        System.out.println("Enter some characters.");
        System.in.read(data);

        System.out.println("You entered: ");
        for(int i=0; i < data.length; i++)
            System.out.format("byte value: %d, char: %c%n",
                data[i], (char)data[i]);
        System.out.format("%n%s%n",data);
    }
}
