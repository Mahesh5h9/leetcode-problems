class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2]; 
        int[] neg = new int[n / 2]; 
        int j = 0, k = 0;
        for (int num : nums) {
            if (num > 0) {
                pos[j++] = num;
            } else {
                neg[k++] = num;
            }
        }
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[2 * i] = pos[i];
            result[2 * i + 1] = neg[i];
        }

        return result;
    }
}