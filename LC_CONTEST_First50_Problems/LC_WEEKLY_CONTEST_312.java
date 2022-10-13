package LC_CONTEST_First50_Problems;
import java.util.*;
public class LC_WEEKLY_CONTEST_312 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> val=new TreeMap<>();
        for(int i=0;i<names.length;i++)
            val.put(heights[i],names[i]);
        String[] res=val.values().toArray(new String[names.length]);
        Collections.reverse(Arrays.asList(res));
        return res;
    }
}
