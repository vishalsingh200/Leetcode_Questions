class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean fre[] = new boolean[nums.length];
        find(nums, new Stack<>(), ans, fre);
        return ans;
    }
    private void find(int[] arr, Stack<Integer> stack, List<List<Integer>> ans, boolean fre[]){
        if(stack.size() == arr.length){
            ans.add(new ArrayList<>(stack));
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!fre[i]){
                fre[i] = true;
                stack.push(arr[i]);
                find(arr, stack, ans, fre);
                stack.pop();
                fre[i] = false;
            }
        }
    }
}
























// List<List<Integer>> result = new ArrayList<>();
//         helper(nums, 0, result);
//         return result;
//     }
//     static void helper(int[] nums, int index, List<List<Integer>> result){
//         if (index == nums.length - 1){
//             List<Integer> temp = new ArrayList<>();
//             for (int i = 0; i < nums.length; i++){
//                 temp.add(nums[i]);
//             }
//             result.add(temp);
//             return;
//         }
//         for (int i = index; i < nums.length; i++){
//             swap(nums, index, i);
//             helper(nums, index + 1, result);
//             swap(nums, index, i);
//         }
//         return;
//     }
//     public static void swap(int[] nums, int start, int end){
//         int temp = nums[start];
//         nums[start] = nums[end];
//         nums[end] = temp;