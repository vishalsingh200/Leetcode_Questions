class Solution {
    public String mergeAlternately(String word1, String word2) {
        int str1 = word1.length();
        int str2 = word2.length();
        
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < Math.max(str1, str2); i++){
            if (i < str1){
                res.append(word1.charAt(i));
            }
            if (i < str2){
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}