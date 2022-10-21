package LC_CONTEST_First50_Problems;

import java.util.ArrayList;
import java.util.List;

public class LC_WEEKLY_CONTEST_293 {
    public List<String> removeAnagrams(String[] words) {
        List<String> res= new ArrayList<>();
        int n= words.length;
        for(int i=0;i<n;){
            int j=i+1;
            while( j<n && isang(words[i],words[j]) ) j++;
            res.add(words[i]);
            i=j;
        }
        return res;
    }
    boolean isang(String p,String q){
        int[] count= new int[26];
        int res=0;
        for(int i=0;i<p.length();i++) count[p.charAt(i)-'a']++;
        for(int i=0;i<q.length();i++) count[q.charAt(i)-'a']--;
        for(int i:count) if(i!=0) return false;
        return true;
    }
}
