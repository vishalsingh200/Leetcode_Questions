class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int a1 = a.length(); 
        int b1 = b.length();
        int maximum = Math.max(a1, b1);
        
        int carry = 0; 
        for(int i = 1; i <= maximum; i++) {
            int sum = carry; 
            
            if (a1 - i >= 0)
                sum += (a.charAt(a1 - i) - '0'); 
            if (b1 - i >= 0)
                sum += (b.charAt(b1 - i) - '0'); 
       
            result.insert(0, sum % 2); 
            carry = sum / 2; 
        }
        
        if (carry > 0) result.insert(0, carry); 
        
        return result.toString();
    }
}