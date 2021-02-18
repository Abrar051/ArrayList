package PerformanceMeasure;

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    FunctionHolder obj = new FunctionHolder();
    ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        //process
        obj.NormalSearch(3);
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
