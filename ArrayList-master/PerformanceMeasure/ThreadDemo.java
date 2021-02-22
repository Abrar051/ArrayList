package PerformanceMeasure;

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    private int number;
    FunctionHolder obj = new FunctionHolder();
    ThreadDemo(String name) {
        this.threadName = name;
        this.number = number;
    }

    public void run() {
        //process
        obj.search(this.threadName,this.number);
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
