package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_302 {
    public int[] numberOfPairs(int[] nums) {
        int[] hash=new int[101];
        int pair=0,left=0;
        for(int i:nums) hash[i]++;
        for(int i:hash){
            pair+=i/2;
            left+=i%2;
        }
        return new int[]{pair,left};
    }
}
