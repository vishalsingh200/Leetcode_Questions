class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        
        while (end >= start){
            int mid = start + (end - start) / 2;
            
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
       
        
        // for(char letter : letters){
        //     if(letter > target){
        //         return letter;
        //     }
        // }
        // return letters[0];
    }
}