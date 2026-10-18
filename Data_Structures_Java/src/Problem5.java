public class Problem5 {

    public static void main(String[] args) {
        /*
         * Input Array[] = {3,4,6,1,5,2,7,8,9}
         * Expected output: 6,4,3,2,5,1,9,8,7
         */
        int[] arr = { 3, 4, 6, 1, 5, 2, 7, 8, 9 };
        int strip = 3;

        reverse(arr, strip);
        if (arr.length > 0) {
            System.out.print(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.print("," + arr[i]);
            }
        }
    }

    public static void reverse(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
