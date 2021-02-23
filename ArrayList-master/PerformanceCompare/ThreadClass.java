package PerformanceCompare;
import java.lang.Thread;
public class ThreadClass extends Thread {
    public Thread t;
    public int[] array;
    private int number;
    public long runTime;
    BinarySearch obj = new BinarySearch();
    NormalSearch obj1 = new NormalSearch();
    ArrayMaker maker = new ArrayMaker();
    ThreadClass(int[] array , int number) {
        this.number = number;
        this.array = array;
    }

    Thread normal = new Thread()
    {
        public void run ()
        {
            obj.search(number,array);
        }
    };
    Thread binary = new Thread()
    {
        public void run ()
        {
            obj1.search(number,array);
        }
    };

    Thread compare = new Thread()
    {
        public void run ()
        {
            maker.compare(getNTime(),getBTime());
        }
        public long getNTime ()
        {
            long time = System.nanoTime();
            normal.start();
            long newTime = System.nanoTime()-time;
            normal.interrupt();
            return newTime;
        }
        public long getBTime ()
        {
            long time = System.nanoTime();
            binary.start();
            long newTime = System.nanoTime()-time;
            binary.interrupt();
            return newTime;
        }
    };


}
