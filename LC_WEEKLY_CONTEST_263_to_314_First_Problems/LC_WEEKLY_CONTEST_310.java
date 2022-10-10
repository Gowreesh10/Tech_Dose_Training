package LC_WEEKLY_CONTEST_263_to_314_First_Problems;
import java.util.*;
public class LC_WEEKLY_CONTEST_310 {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int ind=0;
        int count=0;
        int[] hash= new int[100001];
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)!=1)
                hash[nums[i]]++;
        }
        for(int i=0;i<hash.length;i++){
            if((i&1)!=1 && hash[i]>count){
                count=hash[i];
                ind=i;
            }
        }
        if(count==0)
            return -1;
        else if(ind==0)
            return 0;
        else
            return ind;
    }
}
