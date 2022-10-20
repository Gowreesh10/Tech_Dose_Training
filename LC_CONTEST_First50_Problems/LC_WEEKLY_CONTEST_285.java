package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_285 {
    public int countHillValley(int[] nums) {
        int count=0,left=nums[0];
        //if(nums.length<3) return count;
        for(int i=1;i<nums.length-1;i++){
            //if((nums[i-1]<nums[i]&&nums[i+1]<nums[i])||(nums[i-1]>nums[i]&&nums[i+1]>nums[i])) count++;
            if(left<nums[i]&&nums[i]>nums[i+1]||left>nums[i]&&nums[i]<nums[i+1]){
                count++;
                left=nums[i];
            }
        }
        return count;
    }
}
