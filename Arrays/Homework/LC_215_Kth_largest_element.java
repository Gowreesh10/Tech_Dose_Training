package Arrays.Homework;
import java.util.*;
public class LC_215_Kth_largest_element {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
