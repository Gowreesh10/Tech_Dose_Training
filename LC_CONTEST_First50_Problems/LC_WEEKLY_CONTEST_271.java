package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_271 {
    public int countPoints(String rings) {
        boolean[] red = new boolean[10];
        boolean[] green = new boolean[10];
        boolean[] blue = new boolean[10];
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int num = rings.charAt(i + 1) - '0';
            if (color == 'R') red[num] = true;
            else if (color == 'G') green[num] = true;
            else blue[num] = true;
        }
        int numRings = 0;
        for (int i = 0; i < 10; i++) {
            if (red[i] && green[i] && blue[i])
                numRings++;
        }
        return numRings;
    }
}
