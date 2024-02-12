class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        int firstHalfVowels = 0;
        int secondHalfVowels = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                firstHalfVowels++;
            }
        }
        for (int i = n; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                secondHalfVowels++;
            }
        }
        return firstHalfVowels == secondHalfVowels;
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}