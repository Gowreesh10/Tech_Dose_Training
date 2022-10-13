package LC_CONTEST_First50_Problems;

public class LC_BWEEKLY_CONTEST_88 {
    public boolean equalFrequency(String word) {
        int len=word.length();
        int[] hash=new int[26];
        for(int i=0;i<len;i++)
            hash[word.charAt(i)-'a']++;
        for(int i=0;i<len;i++){
            hash[word.charAt(i)-'a']--;
            if(isValid(hash)){
                return true;
            }
            hash[word.charAt(i)-'a']++;
        }
        return false;
    }
    static boolean isValid(int[] hash){
        int c=0;
        for(int i:hash){
            if(i==0) continue;
            else if(c==0) c=i;
            else if(c==i) continue;
            else return false;
        }
        return true;
    }
}
