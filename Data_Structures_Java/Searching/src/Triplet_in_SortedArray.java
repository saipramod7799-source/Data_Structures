public class Triplet_in_SortedArray {

    public static void main(String[] args) {
        int[] input = {2, 3, 4, 8, 9, 20, 40};
        int sum = 32;
        int n = input.length;
        System.out.println("Triplet is: " + triplet(input, n, sum));
    }

    public static boolean ispair(int[] array, int i, int n, int sum) {
        int j = n - 1;
        while (i < j) {
            if (array[i]+array[j] > sum) {
                j--;
            }
            else if (array[i]+array[j] < sum) {
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static boolean triplet(int[] array, int n, int sum) {
        for (int i = 0; i < n - 2; i++) {
            if (ispair(array, i + 1, n, sum - array[i])) {
                return true;
            }
        }
        return false;
    }
}
