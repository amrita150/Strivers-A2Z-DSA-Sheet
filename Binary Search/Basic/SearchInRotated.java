//search in rotated and sorted array

import java.util.*;

class SearchInRotated{
    public static int search(int arr[] , int target , int start , int end)
    {
        if(start>end)
        {
            return -1;
        }

        //mid 
        int mid = (start+end)/2;

        //found
        if(arr[mid]==target){
            return mid;
        }

        //mid on line 1
        if(arr[mid]<target)
        {
            if(arr[start]<=target && target<=arr[mid-1])
            {
                return search(arr, target, start, mid-1);
            }
            else{
                return search(arr, target, mid+1, end);
            }
        }

        //mid on line 2
        else{
            if (arr[mid+1]<=target && target<=arr[end]) {
                return search(arr, target, mid+1, end);
            }
            else{
                return search(arr, target, start, mid-1);
            }
        }

        
    }
    public static void main(String[] args) {
        int arr[] = new int[6];

        System.out.println("Enter values of array elements : ");
        Scanner sc = new Scanner(System.in);
     
        for(int i = 0 ; i< arr.length ; i++)
        {
          arr[i]= sc.nextInt();
        }
        System.out.println("Enter target elements : ");

        int target = sc.nextInt();

       System.out.println(search(arr, target, 0, arr.length-1));
    }
}