package PerformanceMeasure2;

public class ThreadDemo extends Thread{
    public Thread t;
    private String threadName;
    private int number;
    public long runTime;

    ThreadDemo(String name , int number) {
        this.threadName = name;
        this.number = number;
    }
    public void run() {
        //process
        //obj.search(this.threadName,this.number);
    }

    public long getTime ()
    {
        start();
        long time = System.nanoTime();
        //search(this.threadName,this.number);
        long newTime = System.nanoTime()-time;
        t.interrupt();
        return newTime;
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
