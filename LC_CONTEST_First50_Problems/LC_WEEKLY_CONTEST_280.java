package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_280 {
    public int countOperations(int num1, int num2) {
        int cnt=1;
        if(num1==0&&num2==0) return 0;
        while(true){
            if(num1==0||num2==0) return 0;
            else if(num1==num2) break;
            if(num1<num2){
                num2-=num1;
                cnt++;
            }
            else if(num1>num2){
                num1-=num2;
                cnt++;
            }
        }
        return cnt;
    }
}
