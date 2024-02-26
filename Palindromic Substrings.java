class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += expandPalindrome(s, i, i); 
            count += expandPalindrome(s, i, i + 1); 
        }

        return count;
    }

    private int expandPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}