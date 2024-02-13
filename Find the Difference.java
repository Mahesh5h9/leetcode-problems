class Solution {
    public char findTheDifference(String s, String t) {
        if (s.isEmpty()) {
            return t.charAt(0);
        }
        int xor = 0;
        for (int i = 0; i < t.length(); i++) {
            xor ^= t.charAt(i);
            if (i < s.length()) {
                xor ^= s.charAt(i);
            }
        }
        return (char) xor;
    }
}