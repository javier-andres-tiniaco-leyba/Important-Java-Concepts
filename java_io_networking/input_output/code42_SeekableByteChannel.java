import static java.nio.file.StandardOpenOption.*;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

class SeekableByteChannelTest {
    public static void main(String[] args) {

        Path file = Paths.get("code42_SeekableByteChannel.java");

        Set<StandardOpenOption> options = new HashSet<StandardOpenOption>();
        options.add(READ);

        try (SeekableByteChannel sbc = Files.newByteChannel(file, options)) {
            ByteBuffer buf = ByteBuffer.allocate(10);
            String encoding = "UTF-8";
            while(sbc.read(buf) > 0) {
                buf.rewind();
                System.out.print(Charset.forName(encoding).decode(buf));
                buf.flip();
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
