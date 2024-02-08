class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = carry;
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
        return newDigits;
    }
}