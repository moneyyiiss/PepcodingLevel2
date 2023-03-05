import java.util.Stack;

class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int heights[] = new int[matrix[0].length];

        for(int i=0; i<matrix[0].length; i++){
            heights[i] = matrix[0][i] - '0';
        }
        int area = largestRectangleArea(heights);
        for(int i=1; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                }else{
                    heights[j] = 0;
                }
            }
            area = Math.max(area, largestRectangleArea(heights));
        }
        return area;
        
    }
    public static int largestRectangleArea(int[] heights){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxArea = 0;
        for(int i=0; i<=heights.length; i++){
            int val = i == heights.length ? 0:heights[i];
            while(st.peek() != -1 && heights[st.peek()] >= val){
                int rm = i;
                int h = heights[st.pop()];
                int lm = st.peek();
                maxArea = Math.max(maxArea, h*(rm-lm-1));
            }
            st.push(i);
        }
        return maxArea;
    }
}