class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }
    private void backtrack(List<List<Integer>> results, List<Integer> current, int[] candidates, int remainingTarget, int start) {
        if (remainingTarget == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (remainingTarget >= candidates[i]) {
                current.add(candidates[i]);
                backtrack(results, current, candidates, remainingTarget - candidates[i], i + 1);
                current.remove(current.size() - 1);
            }
        }
    }
}