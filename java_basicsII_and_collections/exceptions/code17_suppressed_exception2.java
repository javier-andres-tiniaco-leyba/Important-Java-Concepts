// https://stackoverflow.com/questions/7849416/what-is-a-suppressed-exception

class SuppressedExceptions {
    public static void main(String[] args) throws
            TryException, FinallyException {
        try {
            callTryFinallyBlock();
        } catch (Exception e) {
            e.printStackTrace();
            for(Throwable t: e.getSuppressed()) {
                t.printStackTrace();
            }
        }
    }

    private static void callTryFinallyBlock() throws
            TryException, FinallyException {
        Throwable t = null;
        try {
            throw new TryException();
        }
        catch (Exception e) {
            t = e;
        }
        finally {
            FinallyException fEx = new FinallyException();
            if(t != null) fEx.addSuppressed(t);
            throw fEx;
        }
    }
}

class TryException extends Exception {}

class FinallyException extends Exception {}
