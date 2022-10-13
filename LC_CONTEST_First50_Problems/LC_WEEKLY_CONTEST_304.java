package LC_CONTEST_First50_Problems;
import java.util.HashSet;
import java.util.Set;
public class LC_WEEKLY_CONTEST_304 {
    public int minimumOperations(int[] nums) {
        Set<Integer> res=new HashSet<>();
        for(int val:nums){
            if(val>0)
                res.add(val);
        }
        return res.size();
    }
}
