package LC_CONTEST_First50_Problems;
public class LC_WEEKLY_CONTEST_268 {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0,j=n-1;
        while(colors[0]==colors[j]) j--;
        while(colors[n-1]==colors[i]) i++;
        return Math.max(n-i-1,j);
    }
}
