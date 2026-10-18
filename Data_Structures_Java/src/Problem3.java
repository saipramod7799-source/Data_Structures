public class Problem3 {

    public static void main(String args[]) {
        // Input array-> consist of elements 1,5,11,31,3,42
        // Find out indices of above array, which elements combination gives rise to sum
        // of 40
        // Expected output : a(0), a(1),a(3),a(4)

        int[] nums = { 1, 5, 11, 31, 3, 42 };
        int target = 40;

        System.out.print("Expected output : ");
        findCombination(nums, target, 0, "");
    }

    public static boolean findCombination(int[] arr, int target, int index, String result) {

        if (target == 0) {
            System.out.println(result.substring(0, result.length() - 2));
            return true;
        }
        if (target < 0 || index >= arr.length) {
            return false;
        }
        if (findCombination(arr, target - arr[index], index + 1, result + "a(" + index + "), ")) {
            return true;
        }
        return findCombination(arr, target, index + 1, result);
    }
}
