public class Leader_element {
    public static void main(String[] args) {
        int[] arr = {5,3,8,9,7,4};
        
        LeaderElements(arr);
    }
    
    public static void LeaderElements(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
