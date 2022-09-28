package Arrays.Homework;
public class LC_75_sort_colors {
    public void sortColors(int[] nums) {
        int[] hash=new int[3];
        for(int i=0;i<nums.length;i++)
            hash[nums[i]]++;
        int k=0;
        for(int i=0;i<nums.length;i++){
            while(hash[k]==0)
                k++;
            nums[i]=k;
            hash[k]--;
        }
    }
}
