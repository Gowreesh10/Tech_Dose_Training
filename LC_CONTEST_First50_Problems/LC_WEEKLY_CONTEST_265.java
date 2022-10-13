package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_265 {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
