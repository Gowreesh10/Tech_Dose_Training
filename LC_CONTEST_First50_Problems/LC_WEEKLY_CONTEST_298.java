package LC_CONTEST_First50_Problems;

import java.util.HashSet;
import java.util.Set;

public class LC_WEEKLY_CONTEST_298 {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
            set.add(ch);
        for(char ch = 'Z'; ch >= 'A'; ch--)
            if(set.contains(ch) && set.contains((char)('a'+(ch-'A'))))
                return ""+ch;
        return "";
    }
}
