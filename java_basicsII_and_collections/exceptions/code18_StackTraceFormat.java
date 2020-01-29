// Example of custom stack trace format
class StackTraceFormat {

    public static void main(String[] args) {
        try {
            callableA();
        } catch (Exception cause) {
            StackTraceElement[] elements = cause.getStackTrace();
            System.out.println(cause.getClass().getName());
            for (int i = 0, n = elements.length; i < n; i++) {
                System.err.println("\t"
                    + elements[i].getFileName() + ":" + elements[i].getLineNumber()
                    + ">> " + elements[i].getClassName()
                    + "." + elements[i].getMethodName() + "()");
            }
            cause.printStackTrace();
        }
    }


    public static void callableA() {
        callableB();
    }

    public static void callableB() {
        callableC();
    }

    public static void callableC() {
        throw new IndexOutOfBoundsException();
    }
}

