public class Solution {
    public int minAddToMakeValid(String s) {
        //first method - using stack
        // Stack<Character> st = new Stack<>();
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         st.push(ch);
        //     }else{
        //         if(st.size() > 0 && st.peek() == '('){
        //             st.pop();
        //         }else{
        //             st.push(ch);
        //         }
        //     }
        // }
        // return st.size();
        //same logic better implementation - 2nd method
        int c = 0; // for counting '('
        int ans = 0; // correction for storing ')'
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                c++;
            }else{
                if(c > 0 ){
                    c--;
                }else{
                    ans++;
                }
            }
        }
        return c+ans;
    }
}