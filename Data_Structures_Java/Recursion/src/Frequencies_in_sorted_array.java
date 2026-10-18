public class Frequencies_in_sorted_array {

    public static void main(String[] args){
        int[] input = {10,10,10,25,30,30};
        frequencies(input);
    }

    public static void frequencies(int[] array){
        int n = array.length;
        int freq = 1, i = 1;
        while(i<n){
            while (i<n && array[i] == array[i-1]) {
                freq++;
                i++;
            }
            System.out.println(array[i-1] + ": " + freq);
            freq = 1;
            i++;
        }
        if (n == 1 || array[n-1] != array[n-2])
            System.out.printf(array[n-1] + ": " + 1 );
    }
}
