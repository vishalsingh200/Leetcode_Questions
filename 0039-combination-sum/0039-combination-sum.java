class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, ans, new Stack<>());
        return ans;
    }
    private void find(int ind, int[] arr, int target, List<List<Integer>> ans, Stack<Integer> stack){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(stack));
            }
            return;
        }
        if(arr[ind] <= target){
            stack.add(arr[ind]);
            find(ind, arr, target - arr[ind], ans, stack);
            stack.pop();
        }
        find(ind + 1, arr, target, ans, stack);
    }
}


//         List<List<Integer>> results = new ArrayList<>();
//         LinkedList<Integer> combination = new LinkedList<>();
        
//         this.backtrack(target, combination, 0, candidates, results);
//         return results;
//     }
//     protected void backtrack(int remain, LinkedList<Integer> combination, int start, int [] candidates, List<List<Integer>> results){
//         if (remain == 0){
//             results.add(new ArrayList<Integer>(combination));
//             return;
//         }
//         else if (remain < 0){
//             return;
//         }
//         for (int i = start; i < candidates.length; i++){
//             combination.add(candidates[i]);
//             this.backtrack(remain - candidates[i], combination, i, candidates, results);
//             combination.removeLast();
 // }