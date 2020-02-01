/**
 * https://www.ibm.com/developerworks/java/library/j-jtp04298/index.html
 */
class CaptureHelper {
    public static void main(String[] args) {
        //
    }
}

class Box<T> {
    private T data;

    public T get() {
        return data;
    }

    public void put(T elem) {
        data = elem;
    }

    public void unbox(Box<?> box) {
        System.out.println(box.get());
    }

    public void rebox(Box<?> box) {
        // Try uncommenting line below and compiling
        // box.put(box.get());
        captureHelper(box);
    }

    private <V> void captureHelper(Box<V> box) {
        box.put(box.get());
    }
}