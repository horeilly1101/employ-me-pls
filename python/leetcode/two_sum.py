"""Two Sum

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
