package PerformanceMeasure2;

public class ThreadDemo extends Thread{
    public Thread t;
    public int[] array = new int[10];
    public String threadName;
    private int number;
    public long runTime;
    BinarySearch obj1 = new BinarySearch(number , array);
    NormalSearch obj2 = new NormalSearch(number,array);

    ThreadDemo(int[] array , int number , String threadName) {
        this.array = array;
        this.number = number;
        this.threadName = threadName;
    }
    public void run() {
        //process
        //obj.search(this.threadName,this.number);
        if (this.threadName.equals("Normal"))
        {

        }
        else if (this.threadName.equals("Binary"))
        {

        }
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
