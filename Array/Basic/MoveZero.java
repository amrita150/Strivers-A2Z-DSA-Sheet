import java.util.*;
public class MoveZero {

    public static void moveToEnd(int arr[])
    {
        int n = arr.length;
        int count = 0 ;
        for(int i = 0 ; i<n ; i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count]= temp;
                count++;
            }
        }
    }
    public static void main(String args[]) {
      
        int arr[] = new int[4];
   
      System.out.println("Enter values of array elements : ");
      Scanner sc = new Scanner(System.in);
   
      for(int i = 0 ; i< arr.length ; i++)
      {
        arr[i]= sc.nextInt();
      }

      moveToEnd(arr);

      System.out.println("array after this: ");
      for(int i = 0 ; i< arr.length ; i++)
        {
           System.out.print(arr[i]+" ");
        }
   
    }
}
