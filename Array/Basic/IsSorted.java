import java.util.*;

public class IsSorted {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i = 1 ; i< n ; i++)
        {
            if(a[i]<a[i-1])
            {
                return 0;
            }
        }
        return 1;
    }

public static void main(String args[]) {
     
    int arr[] = new int[5];

  System.out.println("Enter values of array elements : ");
  Scanner sc = new Scanner(System.in);

  for(int i = 0 ; i< arr.length ; i++)
  {
    arr[i]= sc.nextInt();
  }

  if(isSorted(5 , arr)==1)
  {
    System.out.println("Array is sorted");
  }
  else
  {
    System.out.println("Array is not sorted");

  }
}
}