class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if (left > right) {
            return 0;
        }

        int diff = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            diff++;
        }

        return left << diff;
    }
}