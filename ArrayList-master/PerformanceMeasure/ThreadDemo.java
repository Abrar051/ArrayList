package PerformanceMeasure;

class ThreadDemo extends Thread {
    public Thread t;
    private String threadName;
    private int number;
    public long runTime;
    FunctionHolder obj = new FunctionHolder();
    ThreadDemo(String name , int number) {
        this.threadName = name;
        this.number = number;
    }

    public void run() {
        //process
        this.runTime = obj.search(this.threadName,this.number);
        return;
    }

    public long getTime ()
    {
        return this.runTime;
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
