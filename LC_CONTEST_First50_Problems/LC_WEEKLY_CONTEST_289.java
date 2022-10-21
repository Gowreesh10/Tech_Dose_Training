package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_289 {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String nums="";
            for(int i=0;i<s.length();i+=k){
                String t=s.substring(i,Math.min(i+k,s.length()));
                int sum=0;
                for(int j=0;j<t.length();j++){
                    sum+=t.charAt(j)-'0';
                }
                nums+="" + sum;
            }
            s=nums;
        }
        return s;
    }
}
