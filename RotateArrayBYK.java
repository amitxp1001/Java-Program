public class RotateArrayBYK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        
        rotateArray(arr, k);
        
        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        
        // Normalize k to be within the range [0, n)
        k = k % n;
        
        // Reverse the first part of the array
        reverseArray(arr, 0, n - k - 1);
        
        // Reverse the second part of the array
        reverseArray(arr, n - k, n - 1);
        
        // Reverse the entire array
        reverseArray(arr, 0, n - 1);
    }
    
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
