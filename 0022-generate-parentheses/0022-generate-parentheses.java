class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> remain = new ArrayList<String>();
        this.parentheses(remain, "", n, n);
        return remain;
    }
    protected void parentheses(List<String> remain, String s, int left, int right){
        if (left > right){
            return;
        }
        if (left == 0 && right == 0){
            remain.add(s);
            return;
        }
        if (left > 0){
            parentheses(remain, s+"(", left - 1, right);
        }
        if (right > 0){
            parentheses(remain, s+")", left, right - 1);
        }
    }
}