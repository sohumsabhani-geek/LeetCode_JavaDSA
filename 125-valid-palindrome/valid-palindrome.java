class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                st.push(Character.toLowerCase(ch));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch != st.pop()) {
                    return false;
                }
            }
        }

        return true;
    }
}