package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_311 {
    public int smallestEvenMultiple(int n) {
        int i=1;
        for(;i<=400;i++){
            if(i%2==0 & i%n==0)
                break;
        }
        return i;
    }
}
