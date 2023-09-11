public class UpperBound {
    public static int upperBound(int []arr, int x){
        // Write your code here.
        int left = 0;
        int right = arr.length -1 ;
        int ans = arr.length;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] > x){
                ans = mid;
                right = mid -1;
            } else{
                left = mid + 1;
            }
    }

    return ans;
}

public static void main(String[] args) {
    int arr[] = {1,2,3,6,12,34,43};
    int target = 3;
    System.out.println(upperBound(arr,target));
 }
}
