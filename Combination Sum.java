class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(candidates, target, 0, current, results);
        return results;
    }

    private static void dfs(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                current.add(candidates[i]);
                dfs(candidates, target - candidates[i], i, current, results);
                current.remove(current.size() - 1);
            }
        }
    }
}