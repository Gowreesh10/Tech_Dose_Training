package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_274 {
    public boolean checkString(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='b' && s.charAt(i)=='a')
                return false;
        }
        return true;
    }
}
