class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, ans, new Stack<>());
        return ans;
    }
    private void find(int ind, int[] arr, int target, List<List<Integer>> ans, Stack<Integer> stack){
        if(target == 0){
            ans.add(new ArrayList<>(stack));
            
            return;
        }
        for(int i = ind; i < arr.length; i++){
            
            if(i > ind && arr[i] == arr[i -1])
                continue;
            
            if(arr[i] > target)
                
                break;
            
            stack.push(arr[i]);
            find(i + 1, arr, target - arr[i], ans, stack);
            stack.pop();
            
        }
        
    }
}