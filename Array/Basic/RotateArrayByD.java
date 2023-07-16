import java.util.*;

public class RotateArrayByD {
    
//   //rotate array by one
//     public static void rotateArray(int arr[])
//     {
//         int temp = arr[0];
//         for(int i = 0 ; i<arr.length-1 ; i++)
//         {
//             arr[i] = arr[i+1];
//         }
//         arr[arr.length - 1] =temp;
//     } 

//     //this is a brute force approach with time complexity O(nd)
//     //rotate array by d
//     public static void rotateArrayByD(int arr[] , int d)
//     {
//       for(int i = 0 ; i<d ; i++)
//       {
//         rotateArray(arr);
//       }

//       System.out.println("after after rotation: ");
//       for(int i = 0 ; i< arr.length ; i++)
//       {
//          System.out.print(arr[i]+" ");
//       }
      
//     }

    //another approach with time complexity O(n) and space O(d)
    public static void rotateArrayByD(int arr[] , int d)
    {
        int temp[] = new int[d];
        int n = arr.length;
        //store elements till d
        for(int i = 0 ; i< d ; i++)
        {
            temp[i]=arr[i];
        }

        //rotate element n-d
        for(int i = d ; i<n ; i++)
        {
            arr[i-d]=arr[i];
        }

        //rotate d element
        for(int i = 0 ; i<d ; i++)
        {
            arr[n-d+i]=temp[i];
        }

        System.out.println("after after rotation: ");
         for(int i = 0 ; i< arr.length ; i++)
         {
            System.out.print(arr[i]+" ");
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

    System.out.println("Enter values of d: ");
    int d = sc.nextInt();
   rotateArrayByD(arr,d);
 }
}
