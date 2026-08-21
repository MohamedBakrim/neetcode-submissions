class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxn = 0;

        while (i < j) {
            int res = Math.min(heights[i], heights[j]) * (j - i);

            if (res > maxn) {
                maxn = res;
            }

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxn;
    }
}