import java.util.HashMap;
import java.util.*;


/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
public class TwoSum {

    public static int[] twosum(int[] nums, int target){
        // Store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if complement already exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args){
        int[] input = {2, 7, 11, 13};
        int target  = 9;

        int[] result = twosum(input, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
