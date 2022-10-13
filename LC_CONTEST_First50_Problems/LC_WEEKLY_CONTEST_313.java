package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_313 {
    public int commonFactors(int a, int b) {
        int count=0;
        int max=a>b?a:b;
        for(int i=1;i<=max;i++){
            if(a%i==0&&b%i==0)
                count++;
        }
        return count;
    }
}
