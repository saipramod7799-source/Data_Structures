public class First_Occurance_in_Sorted_Array {

    public static void main(String[] args){

        int[] arr = {10,15,15,15,20,20,30,30,30};
        int n = arr.length;
        int x = 20;
        int output = bSearch(arr, n, x);
        System.out.println("The first Occurance of the given element is: " + output);
    }

    public static int bSearch(int[] arr, int n, int x){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if (x > arr[mid]){
                low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            }else {
                if(mid == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
