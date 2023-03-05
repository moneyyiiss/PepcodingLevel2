import java.util.Stack;

public class NextSmallToTheLeft {
    public static int[] solve(int[] arr){
        int n = arr.length;
        int[] nsl = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
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
