package PerformanceMeasure;

class ThreadDemo1 extends Thread {
    private Thread t;
    private String threadName;
    FunctionHolder obj = new FunctionHolder();
    ThreadDemo1(String name) {
        threadName = name;
    }

    public void run() {
        //process
        System.out.println(obj.BinarySearch(3));
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
