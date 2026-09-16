class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(Character.toLowerCase(ch));
            }
        }
         for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                if (Character.toLowerCase(ch) != st.pop()) {
                    return false;
                }
            }
        }
        return true;
    }
}