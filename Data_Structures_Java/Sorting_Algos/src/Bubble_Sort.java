

public class Bubble_Sort {

    //for printing the elements in the array
    void printArray(int array[]){
        int n = array.length;
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    void bubbleSort(int array[]){
        int n = array.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Bubble_Sort sort = new Bubble_Sort();
        int array[] = {2,1,3,10,-1,-8,7,8,99,-89};
        sort.bubbleSort(array);
        sort.printArray(array);
    }
}
