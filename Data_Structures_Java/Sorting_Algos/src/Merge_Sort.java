


public class Merge_Sort {


    void msort(int arr[], int l, int r){
        if(l < r){
            int m = (l+r)/2;

            msort(arr, l, m);
            msort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r){
        int s1 = m-l + 1;
        int s2 = r-m;

        int[] left = new int[s1];
        int[] right = new int[s2];

        for(int i = 0; i<s1; i++){
            left[i] = arr[1+i];
        }
        for(int j=0; j<s2; j++){
            right[j] = arr[m+1+j];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<s1 && j<s2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<s1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<s2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }


    public static void main(String args[]){
        Merge_Sort sort = new Merge_Sort();
        int array[] = {2,1,3,10,-1,-8,7,8,99,-79};
        int l = 0;
        int r = array.length-1;
        sort.msort(array, l, r);

    }
}
