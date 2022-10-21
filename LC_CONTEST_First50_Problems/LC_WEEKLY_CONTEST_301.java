package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_301 {
    public int fillCups(int[] amount) {
        int maxi = 0, sum = 0;
        for(int a: amount) {
            maxi = Math.max(a, maxi);
            sum += a;
        }
        return Math.max(maxi, (sum + 1) / 2);
    }
}
