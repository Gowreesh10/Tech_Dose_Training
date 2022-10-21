package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_295 {
    public int rearrangeCharacters(String s, String target) {
        int[] hash1 = new int[26], hash2 = new int[26];
        for(char ch : s.toCharArray())
            hash1[ch-'a']++;
        for(char ch : target.toCharArray())
            hash2[ch-'a']++;
        int min = Integer.MAX_VALUE;
        for(char ch : target.toCharArray())
            min = Math.min(min,hash1[ch-'a']/hash2[ch-'a']);
        return min;
    }
}
