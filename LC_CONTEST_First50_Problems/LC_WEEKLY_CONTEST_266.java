package LC_CONTEST_First50_Problems;
import java.util.HashSet;
import java.util.Set;
public class LC_WEEKLY_CONTEST_266 {
    public int countVowelSubstrings(String word) {
        int vowel = 0;
        int len = word.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < len-4; i++)
        {
            set.clear();
            for(int j = i; j <len; j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    set.add(ch);
                    if(set.size() == 5)
                        vowel++;
                }
                else
                    break;
            }
        }
        return vowel;
    }
}
