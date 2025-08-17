import java.util.Arrays;

class RotateArray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        if (n == 0) return;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArr(arr, 2);
        System.out.println("After rotating by 2: " + Arrays.toString(arr));
    }
}
