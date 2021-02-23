package PerformanceCompare;

public class NormalSearch implements Search {
    public int index;
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
    }
    public void getNormalIndex ()
    {
        System.out.println("Found after index : "+this.index);
    }
}
