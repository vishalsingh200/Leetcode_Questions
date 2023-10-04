class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(candidates, 0, target, ans, new Stack<>());
        return ans;
    }
    private void find(int[] arr, int ind, int target, List<List<Integer>> ans, Stack<Integer> stack){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(stack));
            }
            return;
        }
        if(arr[ind] <= target){
            stack.push(arr[ind]);
            find(arr, ind, target - arr[ind], ans, stack);
            stack.pop();
            
        }
        find(arr, ind + 1, target, ans, stack);
    }
}