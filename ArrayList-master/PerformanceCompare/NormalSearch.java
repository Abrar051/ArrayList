package PerformanceCompare;

public class NormalSearch implements Search,Runnable {
    public int index;
    public int number;
    public int[] array;
    NormalSearch (int number , int[] array)
    {
        this.number=number;
        this.array=array;
    }
    @Override
    public void search(int num,int[] array) {
        for (int i=0;i<array.length;i++)
        {
            if (array[i]==num)
            {
                this.index=i;
                break;
            }
        }
        return;
    }
    public void getNormalIndex ()
    {
        System.out.println("Found after index : "+this.index);
    }

    @Override
    public void run() {
        search(number,array);
    }
}
