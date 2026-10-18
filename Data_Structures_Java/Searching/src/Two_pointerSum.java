public class Two_pointerSum {

    public static void main(String[] args){
        int[] input = {2,5,8,12,30};
        int sum = 17;
        System.out.println("TWo pointer sum is: " + ispair(input, sum));
    }

    public static boolean ispair(int[] array, int sum){
        int i=0, j=array.length-1;
        while(i<j){
            if(array[i]+array[j] > sum){
                j--;
            } else if (array[i]+array[j] < sum) {
                i++;
            }else
                return true;
        }
        return false;
    }
}
