import java.util.Scanner;

class SecondLargest{

    
    // public static int largest(int arr[] ) 
    // {
    //     int large = Integer.MIN_VALUE;
    //      for(int i = 0 ; i<arr.length ; i++)
    //      {
    //        if(arr[i]>large)
    //       {
    //        large = arr[i];
    //       }
    //      }
    //   return large;
    // }

    // public static int secondLargest(int arr[])
    // {
    //   int large = largest(arr);
    //   int n = arr.length;
    //   int res = -1;
    //   for(int i = 0 ; i<n ; i++)
    //   {
    //     if(arr[i]!=large)
    //     {
    //       if(res==-1)
    //       {
    //         res = arr[i];
    //       }
          
    //       else if(arr[i]>res)
    //       {
    //         res = arr[i];
    //       }
    //     }
    //   }
    //   return res;
    // }

    //optimized approach
    public static int secondLargest(int arr[])
    {
        int largest = arr[0];
        int res = -1;

        for(int i = 1 ; i< arr.length ; i++)
        {
            if(arr[i]>largest)
            {
                res = largest;
                largest = arr[i];
                
            }
            else if(arr[i]!=largest)
            {
            if(res == -1 || arr[i]>res)
            {
                res = arr[i];
            }
            }
        }
        return res;
    }



public static void main(String args[]) {
     
    int arr[] = new int[5];

  System.out.println("Enter values of array elements : ");
  Scanner sc = new Scanner(System.in);

  for(int i = 0 ; i< arr.length ; i++)
  {
    arr[i]= sc.nextInt();
  }

  System.out.println(" Second Largest Element in this array is " + secondLargest(arr));

  sc.close();    
        
    }
}