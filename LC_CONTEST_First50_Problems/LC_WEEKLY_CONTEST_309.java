package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_309 {
    public boolean checkDistances(String s, int[] distance) {
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            int count=0;
            boolean flag=false;
            for(int j=i+1;j<s.length();j++){
                if(hash[s.charAt(i)-'a']==0&&s.charAt(i)!=s.charAt(j))
                    count++;
                if(s.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==true)
                hash[s.charAt(i)-'a']=count;
        }
        for(int i=0;i<s.length();i++){
            if(hash[s.charAt(i)-'a']!=distance[s.charAt(i)-'a'])
                return false;
        }
        return true;
    }
}
