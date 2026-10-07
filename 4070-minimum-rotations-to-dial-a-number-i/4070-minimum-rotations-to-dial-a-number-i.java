class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int current = 0;  // dial starts at 0

        for (char c : s.toCharArray()) {
            int next = c - '0';

            int diff = Math.abs(current - next);

            ans += Math.min(diff, 10 - diff);

            current = next;
        }

        return ans;
    }
}