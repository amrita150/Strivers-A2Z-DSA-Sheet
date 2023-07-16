import java.util.*;

public class RotateArrayByDPlace {
    
    public static void reverse(int arr[] , int start , int end)
    {
        while(start<end)
        {
          int   temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    } 

    //optimized approach O(n) time complexity and constant space
    public static void rotateArrayByD(int arr[] , int d)
    {
        
        int n = arr.length;
        if(d>(n-1)){
            d = d-n;
        }
        reverse(arr,0 , d-1);
        reverse(arr, d , n-1);
        reverse(arr,0,n-1);
    }

 public static void main(String args[]) {
      
     int arr[] = new int[4];

   System.out.println("Enter values of array elements : ");
   Scanner sc = new Scanner(System.in);

   for(int i = 0 ; i< arr.length ; i++)
   {
     arr[i]= sc.nextInt();
   }

    System.out.println("Enter values of d: ");
    int d = sc.nextInt();
    rotateArrayByD(arr,d);

    System.out.println("after after rotation: ");
    for(int i = 0 ; i< arr.length ; i++)
    {
       System.out.print(arr[i]+" ");
    }
  }
}
