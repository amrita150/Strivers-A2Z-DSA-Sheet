//also know as sort an array with 0's , 1's and 2's

public class SortColor {
    // public static void sortColors(int[] arr) {
    //     // using count sort
    //     int zero = 0, two = 0, one = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == 0) {
    //             zero++;
    //         } else if (arr[i] == 1) {
    //             one++;
    //         } else {
    //             two++;
    //         }
    //     }

    //     int i = 0;
    //     while (zero-- != 0) {
    //         arr[i] = 0;
    //         i++;
    //     }
    //     while (one-- != 0) {
    //         arr[i] = 1;
    //         i++;
    //     }
    //     while (two-- != 0) {
    //         arr[i] = 2;
    //         i++;
    //     }
    // }

    //using in-Place algo also known as dutch national flag algo
    public static void sortColors(int[] arr){
        int left = 0 , right = arr.length-1 , mid = 0;
        //the primary goal is to move zero to the left , one to the middle
        //and two to the right
        while(mid<=right){
        if(arr[mid]==0){
            int temp = arr[mid];
            arr[mid] = arr[left];
            arr[left] = temp;
            mid++;
            left++;
        }
        else if(arr[mid]==1){
            int temp = arr[mid];
            arr[mid] = arr[left];
            arr[left] = temp;
            mid++;
        }
        else{
           int temp = arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp; 
            right--;
        }
    }

    }
    public static void main(String args[]) {

        int arr[] = {2,0,2,1,1,0};

        sortColors(arr);

        System.out.println("array after this: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}