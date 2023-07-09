public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArrayByOne(arr);
        
        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void reverseArrayByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = temp;
    }
}
