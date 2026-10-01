class Solution {
    public int longestArithSeqLength(int[] nums) {

        int n = nums.length;
        int ans = 2;

        int[][] dp = new int[n][1001];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                int diff = nums[i] - nums[j];

                int d = diff + 500;

                if (dp[j][d] == 0) {
                    dp[i][d] = 2;
                } else {
                    dp[i][d] = dp[j][d] + 1;
                }

                ans = Math.max(ans, dp[i][d]);
            }
        }

        return ans;
    }
}