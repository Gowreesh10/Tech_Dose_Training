package LC_CONTEST_First50_Problems;
import java.util.*;
public class LC_WEEKLY_CONTEST_308 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[]res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int sum=0,j=0;
            for(j=0;j<nums.length;j++){
                if(sum+nums[j]>queries[i]){
                    res[i]=j;
                    break;
                }
                sum+=nums[j];
            }
            if(j==nums.length)
                res[i]=j;
        }
        return res;
    }
}
