package Arrays.Homework;

public class LC_303_Range_sum_query {
    int[] res;

    public NumArray(int[] nums) {
        res = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            res[i + 1] = res[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return res[j + 1] - res[i];
    }
}
