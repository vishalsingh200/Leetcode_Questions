class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    i++;
                }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                list.add(nums[index]);
            }
        }
        return list;
    }
    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}