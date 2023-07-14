import java.util.*;

public class RotateArrayByOne {
    
    public static void rotateArray(int arr[])
    {
        int temp = arr[0];
        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] =temp;

        for(int i = 0 ; i< arr.length ; i++)
        {
          System.out.print(arr[i]+ " ");
        }
    } 
 public static void main(String args[]) {
      
     int arr[] = new int[6];

   System.out.println("Enter values of array elements : ");
   Scanner sc = new Scanner(System.in);

   for(int i = 0 ; i< arr.length ; i++)
   {
     arr[i]= sc.nextInt();
   }

   rotateArray(arr);
 }
}
