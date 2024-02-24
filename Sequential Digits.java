class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";
        
        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();
        
        for (int length = lowLength; length <= highLength; length++) {
            for (int i = 0; i <= digits.length() - length; i++) {
                String sequential = digits.substring(i, i + length);
                int num = Integer.parseInt(sequential);
                      
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}