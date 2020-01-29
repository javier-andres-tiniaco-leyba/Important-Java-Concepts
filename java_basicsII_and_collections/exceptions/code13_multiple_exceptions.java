// https://stackoverflow.com/questions/7849416/what-is-a-suppressed-exception
// Java SE 7+ -> Throwable.addSuppressed(); Throwable.getSuppressed();
// In Java7 try-with-resources; the exception at AutoCloseable::close() is added
// as suppressed exception by default along with try exception.

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
            // This is the last statement before returning from main
            // so the finally block is executed before executing this one
            throw REcatch;
        } finally {
            RuntimeException REfinally = new RuntimeException("from finally!");
            t.addSuppressed(REfinally);
            System.out.format("%nStarting to print suppressed exceptions:%n");
            for(Throwable th : t.getSuppressed()){
                th.printStackTrace();
            }
        }
    }
}
