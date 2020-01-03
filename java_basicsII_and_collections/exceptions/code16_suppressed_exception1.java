// https://stackoverflow.com/questions/7849416/what-is-a-suppressed-exception

class SuppressedExceptions {
    public static void main(String[] args) throws
            TryException, FinallyException {
        try {
            callTryFinallyBlock();
        } catch (Exception e) {
            e.printStackTrace(); //Only Finally Exception is Caught**
        }
    }

    private static void callTryFinallyBlock() throws
            TryException, FinallyException {
        try {
            throw new TryException(); //This is lost**
        }
        finally {
            FinallyException fEx = new FinallyException();
            throw fEx;
        }
    }
}

class TryException extends Exception {}

class FinallyException extends Exception {}
