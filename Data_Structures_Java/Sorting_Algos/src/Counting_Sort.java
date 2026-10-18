

public class Counting_Sort {

    public static void countingsort(int[] arr, int high){
        int counter[] = new int[high+1];

        for(int i: arr){
            counter[i]++;
        }
        int startpoint = 0;
        for(int i=0; i<counter.length; i++){
            while (0 < counter[i]){
                arr[startpoint++] = i;
                counter[i]--;
            }
        }
    }
}
