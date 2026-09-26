

class Solution {

    public int largestRectangleArea(int[] arr) {
        int n = arr.length;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public int maxArea(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0)
            return 0;

        int m = mat.length;
        int n = mat[0].length;

        int[] heights = new int[n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1)
                    heights[j]++;
                else
                    heights[j] = 0;
            }

            int area = largestRectangleArea(heights);
            max = Math.max(max, area);
        }

        return max;
    }
}