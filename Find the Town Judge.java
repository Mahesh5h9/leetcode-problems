class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];

        for (int[] t : trust) {
            outDegrees[t[0]]++;
            inDegrees[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}