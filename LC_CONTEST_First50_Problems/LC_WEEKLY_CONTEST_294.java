package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_294 {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==letter)
                count++;
        }
        return (count*100)/len;
    }
}
