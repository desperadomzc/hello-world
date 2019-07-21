class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0) return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(target, candidates, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtracking(int target, int[] candidates, int pos, List<Integer> temp, List<List<Integer>> res) {
        if (pos >= candidates.length) return;
        backtracking(target, candidates, pos + 1, temp, res);
        if (target < candidates[pos]) {
            return;
        } else if (target == candidates[pos]) {
            temp.add(candidates[pos]);
            if (!res.contains(temp))
                res.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
        } else {
            temp.add(candidates[pos]);
            backtracking(target - candidates[pos], candidates, pos + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}
