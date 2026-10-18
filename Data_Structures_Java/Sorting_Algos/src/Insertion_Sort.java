

public class Insertion_Sort {

    //for printing the elements in the array
    void printArray(int array[]){
        int n = array.length;
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }



    void insertionSort(int array[]){
        int n = array.length;
        for(int i = 1; i<n; i++){
            int val = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > val){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = val;
        }
    }

    public static void main(String args[]){
        Insertion_Sort sort = new Insertion_Sort();
        int array[] = {2,1,3,10,-1,-8,7,8,99,-79};
        sort.insertionSort(array);
        sort.printArray(array);


    }
}
