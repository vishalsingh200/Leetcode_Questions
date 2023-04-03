class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int count = 0;
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                if (!stack.empty()){
                    stack.pop();
                }
                if(!stack.empty()){
                    count = Math.max(count, i - stack.peek());
                }
                else{
                    stack.push(i);
                }
            }
        }
        return count;
    }
}