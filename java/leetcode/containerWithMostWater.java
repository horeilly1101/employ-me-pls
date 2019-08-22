/*
 * Container With Most Water
 *
 * https://leetcode.com/problems/container-with-most-water
 */

import java.lang.Math;

class Solution {
	public int maxArea(int[] height) {
		return this.maxAreaHelper(height, 0, height.length - 1);
	}

	public int maxAreaHelper(int[] height, int i, int j) {
		if (j <= i)
			return 0;

		int area = (j - i) * Math.min(height[i], height[j]);

		if (height[i] < height[j])
			return Math.max(area, this.maxAreaHelper(height, i + 1, j));

		return Math.max(area, this.maxAreaHelper(height, i, j - 1));
	}
}