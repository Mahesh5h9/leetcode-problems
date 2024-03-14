class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        
        for (int num : nums) {
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
            sum += num;
            count += prefixSumCount.getOrDefault(sum - goal, 0);
        }
        
        return count;
    }
}