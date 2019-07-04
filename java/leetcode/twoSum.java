/*
 * Given an array of integers, return indices of the two numbers such 
 * that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and 
 * you may not use the same element twice.
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