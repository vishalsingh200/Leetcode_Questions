class Solution {
    public int removeDuplicates(int[] arr) {
        int count = 1;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] != arr[i - 1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
      
    
    }
}