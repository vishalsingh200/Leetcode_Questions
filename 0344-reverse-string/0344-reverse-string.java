class Solution {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;
        while (last >= first){
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }
}