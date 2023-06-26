class Solution {
  public void moveZeroes(int[] nums) {
    int result = 0;
    for (final int num : nums)
      if (num != 0)
        nums[result++] = num;

    while (result < nums.length)
      nums[result++] = 0;
  }
}