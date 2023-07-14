import java.util.Scanner;

class Largest{

    public static int largest(int arr[] ) 
    {
        int large = Integer.MIN_VALUE;
         for(int i = 0 ; i<arr.length ; i++)
         {
           if(arr[i]>large)
          {
           large = arr[i];
          }
         }

         return large;
    }

public static void main(String args[]) {
     
    int arr[] = new int[5];

  System.out.println("Enter values of array elements : ");
  Scanner sc = new Scanner(System.in);

  for(int i = 0 ; i< arr.length ; i++)
  {
    arr[i]= sc.nextInt();
  }

  System.out.println("Largest Element in this array is " + largest(arr));

  sc.close();    
        
    }
}