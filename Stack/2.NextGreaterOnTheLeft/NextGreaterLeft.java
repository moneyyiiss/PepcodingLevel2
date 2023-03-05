import java.util.Stack;

class NextGreaterLeft{
    public static int[] solve(int[] arr){
        int n = arr.length;
        int ngl[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size() > 0){
                ngl[i] = st.peek();
            }else{
                ngl[i] = -1;
            }
            st.push(arr[i]);
        }
        return ngl; 
    }
}