class Solution {
    public int numberOfSteps(int nums) {
        return helper(nums, 0);
    }
    private static int helper(int nums, int steps){
        if(nums == 0){
            return steps;
        }
        if(nums % 2 == 0){
            return helper(nums/2, steps+ 1);
        }
        return helper(nums - 1, steps + 1);
    }
}