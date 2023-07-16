import java.util.*;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return n;
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;

    }

    public static void main(String args[]) {
     
    int arr[] = new int[5];

    System.out.println("Enter values of array elements : ");
    Scanner sc = new Scanner(System.in);

    for(int i = 0 ; i< arr.length ; i++)
    {
      arr[i]= sc.nextInt();
    }
        int count = removeDuplicates(arr);


    System.out.println(count);
    
    for(int i = 0 ; i< count; i++)
    {
      System.out.print(arr[i]+" ");
    }
    
}
}
    

