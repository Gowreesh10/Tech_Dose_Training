package LC_CONTEST_First50_Problems;
import java.util.*;
public class LC_WEEKLY_CONTEST_269 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                res.add(i);
        }
        return res;
    }
}
