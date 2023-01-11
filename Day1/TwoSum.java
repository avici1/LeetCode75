package Day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }

            }
        }
        return nums;
    }

    public int[] twoSumOptimised(int [] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            numToIndex.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target-nums[i])) {
                return new int[] {numToIndex.get(target-nums[i]), i};
            }
        }
        return new int[] {};

    }
}
