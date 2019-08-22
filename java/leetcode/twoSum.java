/*
 * Two Sum
 *
 * https://leetcode.com/problems/two-sum/
 */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> rec = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (rec.containsKey(nums[i]))
                return new int[] {rec.get(nums[i]), i};
            
            rec.put(target - nums[i], i);
        }
        return null;
    }
}