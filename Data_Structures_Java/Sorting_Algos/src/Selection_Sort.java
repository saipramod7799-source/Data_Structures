

public class Selection_Sort {

    //for printing the elements in the array
    void printArray(int array[]){
        int n = array.length;
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    void selectionSort(int array[]){
        int n = array.length;
        for(int i = 0; i<n-1; i++){
            int min_index = i;
            for(int j = i+1; j<n; j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }


    public static void main(String args[]){
        Selection_Sort sort = new Selection_Sort();
        int array[] = {2,1,3,10,-1,-8,7,8,99,-9};
        sort.selectionSort(array);
        sort.printArray(array);

    }

}
