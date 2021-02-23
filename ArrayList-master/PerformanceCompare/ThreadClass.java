package PerformanceCompare;


public class ThreadClass {

    private Thread t;

    public long getTime (Thread t)
    {
        this.t=t;
        long time = System.nanoTime();
        this.t.start();
        long newTime = System.nanoTime()-time;
        return newTime;
    }
}
