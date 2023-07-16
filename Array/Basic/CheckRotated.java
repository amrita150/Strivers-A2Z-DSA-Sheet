import java.util.*;

public class CheckRotated {
    
   
    public static int checkRotatedAndSorted(int arr[]){
        int n = arr.length;
        int count = 0 ;
        for(int i = 1 ; i<n ; i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
            }
        }
        if(arr[n-1]>arr[0])
        {
            count++;
        }

        return count;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[7];

        System.out.println("Enter values of array elements : ");
        Scanner sc = new Scanner(System.in);
     
        for(int i = 0 ; i< arr.length ; i++)
        {
          arr[i]= sc.nextInt();
        }

        if(checkRotatedAndSorted(arr) <= 1)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
         }
        }

}
