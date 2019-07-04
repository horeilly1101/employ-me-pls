"""Two Sum

Given an array of integers, return indices of the two numbers such that they add 
up to a specific target.

You may assume that each input would have exactly one solution, and you may not 
use the same element twice.

https://leetcode.com/problems/two-sum/
"""

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        rec = {}
        for i, num in enumerate(nums):
            if num in rec:
                return [rec[num], i]
            rec[target - num] = i
        return []