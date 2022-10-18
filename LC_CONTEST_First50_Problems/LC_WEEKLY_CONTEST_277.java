package LC_CONTEST_First50_Problems;
import java.util.*;
public class LC_WEEKLY_CONTEST_277 {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int min=nums[0],max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min&&nums[i]<max) count++;
        }
        return count;
    }
}
