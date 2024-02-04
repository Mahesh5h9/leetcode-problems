class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int used[] = new int[128];  
        Arrays.fill(used, -1);

        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            if (used[index] >= start) {  
                maxLen = Math.max(maxLen, i - start);
                start = used[index] + 1;  
            }
            used[index] = i;  
        }

        maxLen = Math.max(maxLen, n - start);  
        return maxLen;
    }
}