import java.util.Stack;

public class NextSmallerToTheRight {
    public static int[] solve(int[] arr){
        int n = arr.length;
        int[] nsl = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(st.size() > 0 && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.size() > 0){
                nsl[i] = st.peek();
            }else{
                nsl[i] = -1;
            }
            st.push(arr[i]);
        } 
        return nsl;

    }
}
