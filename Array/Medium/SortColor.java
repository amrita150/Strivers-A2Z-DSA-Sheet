//also know as sort an array with 0's , 1's and 2's

public class SortColor {
    public static void sortColors(int[] arr) {
        // using count sort
        int zero = 0, two = 0, one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        int i = 0;
        while (zero-- != 0) {
            arr[i] = 0;
            i++;
        }
        while (one-- != 0) {
            arr[i] = 1;
            i++;
        }
        while (two-- != 0) {
            arr[i] = 2;
            i++;
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