package Sorter_Strategy

public  class Bubble implements Strategy
{
    public double[] sort(double[] arr)			
    {    
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]>arr[j])		
                {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Bubble Sort");
        return arr;
    }
}
