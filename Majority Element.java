class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = num;
                    count = 1;
                }
            }
        }
        return candidate;
    }
}