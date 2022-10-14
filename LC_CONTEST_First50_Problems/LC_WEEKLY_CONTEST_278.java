package LC_CONTEST_First50_Problems;
import java.util.ArrayList;
import java.util.List;
public class LC_WEEKLY_CONTEST_278 {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        while(true){
            if(list.contains(original))
                original*=2;
            else
                return original;
        }
    }
}
