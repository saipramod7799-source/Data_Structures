import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;


//initialzation
public class Inits{

    public static void main(String[] args){

        //Array: Static

        int[] arr = {2,4,5,6,7,89};
        int[] arr2 = new int[]{2,5,6,7,8,11,23,4};

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        //Array: Dynamic

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Dynamic array size: " );
        int n = sc.nextInt();

        int[] darr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element: " );
            darr[i] = sc.nextInt();
        }

        for (int i = 0; i<darr.length; i++){
            System.out.print(darr[i] + ", ");
        }

        //List: Both are immutable

        List<Integer> list = Arrays.asList(2,4,1,5,3,4,7,8,9);
        List<Integer> list1 = List.of(1,45,34,22);

        //Mutable

        List<Integer> arraylist = new ArrayList<>(Arrays.asList(3,8,9,456,233));
        arraylist.add(23);
        arraylist.add(45);
        arraylist.remove(9);
        System.out.println("get at 2: " + arraylist.get(2));
        System.out.println("set at 5: " + arraylist.set(5, 19));
        System.out.println("size: " + arraylist.size());
        System.out.println("is empty: " + arraylist.isEmpty());
        System.out.println("contains: " + arraylist.contains(20));
        System.out.println("index of: " + arraylist.indexOf(19));

        //split

        String str = "mine, yours, apple, banana";
        String[] arr1 = str.split(",");

        //HashSet

        Set<Integer> set = new HashSet<>(Arrays.asList(3,8,9,456,233));
        set.add(23);
        set.add(45);
        set.remove(9);
//        System.out.println("get at 2: " + set.get(2));
//        System.out.println("set at 5: " + set.set(5, 19));
        System.out.println("size: " + set.size());
        System.out.println("is empty: " + set.isEmpty());
        System.out.println("contains: " + set.contains(20));
//        System.out.println("index of: " + set.indexOf(19));

        //HashMap

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "deepak");
        map.put(202, "navaneeth");

        System.out.println(map.get(101));
        System.out.println(map.getOrDefault(105, "Not Found"));

        //printing keys and values
        for (Map.Entry<Integer, String> entry: map.entrySet()){

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        for (Integer key: map.keySet()){
            System.out.println(key);
        }

        for(String value: map.values()){
            System.out.println(value);
        }
    }
}