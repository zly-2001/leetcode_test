package hash;
import java.util.*;

public class two_num_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        two_num_sum two_num_sum = new two_num_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = two_num_sum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
