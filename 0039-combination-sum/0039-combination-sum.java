class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> combination = new LinkedList<>();
        
        this.backtrack(target, combination, 0, candidates, results);
        return results;
    }
    protected void backtrack(int remain, LinkedList<Integer> combination, int start, int [] candidates, List<List<Integer>> results){
        if (remain == 0){
            results.add(new ArrayList<Integer>(combination));
            return;
        }
        else if (remain < 0){
            return;
        }
        for (int i = start; i < candidates.length; i++){
            combination.add(candidates[i]);
            this.backtrack(remain - candidates[i], combination, i, candidates, results);
            combination.removeLast();
        }
    }
}