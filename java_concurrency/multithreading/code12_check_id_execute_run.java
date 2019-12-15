class PrintServer implements Runnable {
    private final PrintQueue requests = new PrintQueue();
    private final long id;

    public PrintServer() {
        Thread t = new Thread(this).start();
        this.id = t.getId();
    }

    public void print(PrintJob job) {
        requests.add(job);
    }

    // Compare the identity of the thread invoking run with the
    // thread supposed to execute run to avoid outsider code
    // calling the public method run
    public void run() {
        if (Thread.currentThread().getId() != this.id)
            return;
        for(;;)
            realPrint(requests.remove());
    }

    private void realPrint(PrintJob job) {
    // do the real work of printing
    }
}

class PrintServer2 {
    private final PrintQueue requests = new PrintQueue();

    public PrintServer2() {
        // Anonymous inner class is used to avoid anyone from
        // calling public run method
        Runnable service = new Runnable() {
            public void run() {
                for(;;)
                    realPrint(requests.remove());
                }
            };

            new Thread(service).start();
    }

    public void print(PrintJob job) {
        requests.add(job);
    }

    private void realPrint(PrintJob job) {
    // do the real work of printing
    }
}
