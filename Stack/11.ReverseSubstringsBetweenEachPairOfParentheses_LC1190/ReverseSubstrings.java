import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseSubstrings {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                Queue<Character> q = new LinkedList();
                while(st.peek() != '('){
                    q.add(st.pop());
                }
                st.pop();
                while(q.size() > 0){
                    st.push(q.remove());
                }
            }else{
                st.push(ch);
            }
        }
        char []ans = new char[st.size()];
        int i = ans.length-1;
        while(i >= 0){
            ans[i] = st.pop();
            i--;
        }
        return new String(ans);
    }
}