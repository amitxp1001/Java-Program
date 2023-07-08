public class Arrayaddition {
    public static void main(String[] args) {
        int[] arr_1 = {1, 2, 3, 4};
        int[] arr_2 = {5, 6, 7, 8};
        
        int[] result = addArrays(arr_1, arr_2);
        
        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] addArrays(int[] arr_1, int[] arr_2) {
        int n = arr_1.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = arr_1[i] + arr_2[i];
        }
        
        return result;
    }
}

