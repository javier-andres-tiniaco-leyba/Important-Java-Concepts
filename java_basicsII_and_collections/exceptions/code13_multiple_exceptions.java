// https://stackoverflow.com/questions/7849416/what-is-a-suppressed-exception
// Java SE 7+ -> Throwable.addSuppressed(); Throwable.getSuppressed();

import java.io.Closeable;

class MultipleExceptionsExample {

    static class IOManip implements Closeable {
        @Override
        public void close() {
            throw new RuntimeException("from IOManip.close");
        }
    }

    public static void main(String[] args) throws Exception {
        Throwable t = null;
        try(IOManip ioManip = new IOManip()) {
            throw new RuntimeException("from try!");
        } catch(Exception e) {
            t = e;
            RuntimeException REcatch = new RuntimeException("from catch!");
            t.addSuppressed(REcatch);
            throw REcatch;
        } finally {
            RuntimeException REfinally = new RuntimeException("from finally!");
            t.addSuppressed(REfinally);
            for(Throwable th : t.getSuppressed()){
                th.printStackTrace();
            }
        }
    }
}
