// https://stackoverflow.com/questions/7849416/what-is-a-suppressed-exception

class SuppressedExceptions {
    public static void main(String[] args) {
        try {
            callTryFinallyBlock();
        } catch (Exception e) {
            System.out.println("Inside catch block from main method.");
            // Only Finally Exception is caught.
            e.printStackTrace();
        }
    }

    private static void callTryFinallyBlock() throws
            TryException, FinallyException {
        try {
            // This exception is supressed.
            throw new TryException();
        } finally {
            FinallyException fEx = new FinallyException();
            throw fEx;
        }
    }
}

class TryException extends Exception {}

class FinallyException extends Exception {}
