import java.util.*;
class SearchInRotated2 {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
        
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

       System.out.println(search(arr, target));
    }
}