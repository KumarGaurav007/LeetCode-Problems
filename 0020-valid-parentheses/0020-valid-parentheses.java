class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') st.push(ch);
            else if(ch == '{') st.push(ch);
            else if(ch == '[') st.push(ch);
            else if(ch == ')'){
                if(st.isEmpty()) return false;
                else if(st.peek() == '(') st.pop();
                else return false;
            }
            else if(ch == '}'){
                if(st.isEmpty()) return false;
                else if(st.peek() == '{') st.pop();
                else return false;
            }
            else if(ch == ']'){
                if(st.isEmpty()) return false;
                else if(st.peek() == '[') st.pop();
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}