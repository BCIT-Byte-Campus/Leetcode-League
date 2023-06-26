class Solution {
  public int maxArea(int[] height) {
    int result = 0;
    int l = 0;
    int n = height.length - 1;

    while (l < n) {
      final int minHeight = Math.min(height[l], height[n]);
      result = Math.max(result, minHeight * (n - l));
      if (height[l] < height[n])
        ++l;
      else
        --n;
    }

    return result;
  }
}