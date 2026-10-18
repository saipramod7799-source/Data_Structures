public class Subsets_sum_equals_to_num {

    public static void main(String[] args){

        int[] array = {10,25,15};
        int sum = 25;
        int output = count(array, array.length, sum);
        System.out.println("No of subsets of Given array which equals to sum : " + output);
    }

    public static int count(int[] array, int n, int sum){
        if (n == 0){
            return (sum == 0)? 1: 0;
        }
        return count(array, n-1, sum) + count(array, n-1, sum-array[n-1]);
    }
}
