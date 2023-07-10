class Solution {
    public int longestOnes(int[] A, int k) {
        int left = 0, right = 0, n = A.length;
        while (right < n) {
            if (A[right++] == 0) k--;
            if (k < 0) {
                if (A[left] == 0) k++;
                left++;
            }
        }
        return right - left;
    }
}