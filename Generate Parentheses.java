class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateCombinations("", 0, 0, n, result);
        return result;
    }

    private void generateCombinations(String current, int openCount, int closeCount, int n, List<String> result) {
        if (openCount == n && closeCount == n) {
            result.add(current);
            return;
        }
        if (openCount < n) {
            generateCombinations(current + "(", openCount + 1, closeCount, n, result);
        }
        if (closeCount < openCount) {
            generateCombinations(current + ")", openCount, closeCount + 1, n, result);
        }
    }
}