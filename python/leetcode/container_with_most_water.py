"""Container With Most Water

https://leetcode.com/problems/container-with-most-water/
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        return self.maxAreaHelper(height, 0, len(height) - 1)

    def maxAreaHelper(self, height: List[int], i: int, j: int) -> int:
        if j <= i:
            return 0

        area = (j - i) * min(height[i], height[j])

        if height[i] < height[j]:
            return max(area, self.maxAreaHelper(height, i + 1, j))

        return max(area, self.maxAreaHelper(height, i, j - 1))
