class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = 0;
                while (k < n) {
                    if (grid[i][k] != grid[k][j]) {
                        break;
                    }
                    k++;
                }
                if (k == n) {
                    ans += 1;
                }
            }
        }

        return ans;
    }
}