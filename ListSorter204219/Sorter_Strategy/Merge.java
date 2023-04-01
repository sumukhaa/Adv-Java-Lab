package Sorter_Strategy

public class Merge implements Strategy
{
	public double[] sort(double[] arr) 		// implementing interface method
  	{    
        int s = 0, e = arr.length-1;
        System.out.println("Merge Sort");
     //   for(int i=0;i<arr.length;i++)
        //    System.out.println(arr[i]);
        return div_array(arr,s,e);
 	}
	
	public double[] div_array(double[] arr,int s,int e)	// dividing whole array into two separate arrays
    {
        if(s==e)		// if arr contains single element
        {
            double test[] = {arr[s]};
            return test;
        }

        int mid = (s+e)/2;
        double[] array1 = div_array(arr,s,mid);
        double[] array2 = div_array(arr,mid+1,e);
        return merge_arr(array1,array2);
    }
	
    public double[] merge_arr(double array1[],double array2[])		// merging two sorted arrays into a single sorted array 
    {

       int len1 = array1.length, len2 = array2.length;
       int a = 0, b = 0;
       double comb_arr[] = new double[len1+len2];

       for(int i=0;i<comb_arr.length;i++)
       {

            if(a==len1)		// comparing index and length of array1
            {
                comb_arr[i] = array2[b];
                b++;
            }

            else if(b==len2)  		// comparing index and length of array2
            {
                comb_arr[i] = array1[a];
                a++;
            }

            else if(array1[a]>array2[b])    // checking whether array1 has greater element than array2
            {
                comb_arr[i] = array2[b];
                b++;
            }
            
            else							// checking whether array2 has greater element than array1
            {
                comb_arr[i] = array1[a];
                a++;
            }
       }
 
       return comb_arr;
    }
}
