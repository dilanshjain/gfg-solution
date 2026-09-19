
class Solution {
    public class pair {
        int val;
        int idx;

        pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 0) return ans;

        int[] span = new int[n];
        Stack<pair> st = new Stack<>();

        span[0] = 1;
        st.push(new pair(arr[0], 0));

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && st.peek().val <= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek().idx;
            }

            st.push(new pair(arr[i], i));
        }

        for (int i = 0; i < n; i++) {
            ans.add(span[i]);
        }

        return ans;
    }
}