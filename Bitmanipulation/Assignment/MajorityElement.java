package Bitmanipulation.Assignment;
public class MajorityElement {
    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return(nums[nums.length/2]);  O(nlongn)

        //boyer Moore's voting Algorithm for element appearing >n/2 times
        int major=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                major=nums[i];
                count=1;
            }
            else if(major==nums[i]) count++;
            else count--;
        }
        return major;
        //TC : O(N) SC : O(1)
    }
}
