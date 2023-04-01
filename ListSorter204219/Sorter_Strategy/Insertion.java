package Sorter_Strategy

public  class Insertion implements Strategy
{
    public double[] sort(double[] arr)	
    {    
        double n = arr.length;
        int pass=1;
        double tmp=0.0;
        for(pass=1;pass<n;pass++)
        {
           tmp=arr[pass];
           int i;
           for(i=pass-1;i>=0;i--)		
           {
           		if(tmp>=arr[i])
           			break;
           		else
           			arr[i+1]=arr[i];
           }
           arr[i+1]=tmp;
        }
        System.out.println("Insertion Sort");
        return arr;
    }
}
