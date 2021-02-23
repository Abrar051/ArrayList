package PerformanceCompare;

public class NormalSearch implements Search {
    public int index;
    @Override
    public void search(int num,int[] array) {
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==num)
            {
                System.out.println("Normal sort match found");
                this.index=i;
                break;
            }
        }
    }
    public long getNormalTime (int num,int[] array)
    {
        long time = System.nanoTime();
        search(num,array);
        long newTime = System.nanoTime()-time;
        return newTime;
    }
    public void getNormalIndex ()
    {
        System.out.println("Found after index : "+this.index);
    }
}
