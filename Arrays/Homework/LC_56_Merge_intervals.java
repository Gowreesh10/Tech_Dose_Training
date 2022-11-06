package Arrays.Homework;
import java.util.Stack;
public class LC_56_Merge_intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        Stack<int[]> st = new Stack<>();
        st.push(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            if(st.peek()[1] >= intervals[i][0]){
                int[] arr = st.pop();
                arr[1] = Math.max(arr[1], intervals[i][1]);
                st.push(arr);
            } else {
                st.push(intervals[i]);
            }
        }
        int[][] ans = new int[st.size()][2];
        int index = ans.length-1;
        while(index >= 0){
            ans[index] = st.pop();
            index--;
        }
        return ans;
    }
}
