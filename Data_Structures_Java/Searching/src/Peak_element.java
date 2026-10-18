
public class Peak_element {

    /*
    Peak element is an element which is greater than the neighbour elements
    If we use binary search : After taking middle element check the middle element with left and right elements if the left element is greater than middle then ignore right array and vice-versa
     */
    public static void main(String[] args){

        int[] input = {5,10,20,15,7};
        int length = input.length;
        System.out.println("The peak element of the given array is : " + getpeak(input, length));
    }

    public static int getpeak(int[] array, int n){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if((mid == 0 || array[mid-1] <= array[mid]) &&
                    (mid == n-1 || array[mid+1] <= array[mid])){
                return array[mid];
            }
            if(mid > 0 && array[mid-1] > array[mid]){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
}
