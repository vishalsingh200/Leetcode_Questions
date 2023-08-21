class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int num1 : nums1){
            for(int num2 : nums2){
                if(num1 == num2 && !list.contains(num1)){
                    list.add(num1);
                    break;
                }
            }
        }
        int[] intersection = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            intersection[i] = list.get(i);
        }
        return intersection;
    }
}