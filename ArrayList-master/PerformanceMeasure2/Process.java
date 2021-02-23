package PerformanceMeasure2;

public class Process {
    public int[] array = new int[20];
    public String threadName;
    private int number;
    public long runTime;
    BinarySearch obj1 = new BinarySearch(this.number , this.array);
    NormalSearch obj2 = new NormalSearch(this.number,this.array);

    Process(int[] array , int number) {
        this.array = array;
        this.number = number;
    }
    public long getBinaryTime ()
    {
        long time = System.nanoTime();
        obj1.search(this.number);
        long newTime = System.nanoTime()-time;
        return newTime;
    }
    public long getNormalTime ()
    {
        long time = System.nanoTime();
        obj2.search(this.number);
        long newTime = System.nanoTime()-time;
        return newTime;
    }
    public int printProcessSize ()
    {
        return obj2.getSearchItem();
    }
    public void processStepNormal ()
    {
        System.out.println("Normal process took : "+printProcessSize()+" steps");
    }
    public void getBinarySwapTime ()
    {
        obj1.printSwapStep();
    }
}
