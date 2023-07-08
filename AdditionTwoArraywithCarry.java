public class AdditionTwoArraywithCarry{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
       
        int[] result = addArraysWithCarry(arr1, arr2);
        
        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] addArraysWithCarry(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];
        int carry = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr1[i] + arr2[i] + carry;
            
            result[i] = sum % 10;
            carry = sum / 10;
        }
        
        if (carry != 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            for (int i = 1; i < n + 1; i++) {
                newResult[i] = result[i - 1];
            }
            return newResult;
        } else {
            return result;
        }
    }
}
