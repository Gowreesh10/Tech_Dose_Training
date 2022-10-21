package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_299 {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++ ){
                if ( i == j  || i + j == n - 1 ) {
                    if ( grid[i][j] == 0 ) return false;
                }
                else if ( grid[i][j] != 0 ) return false;
            }
        }
        return true;
    }
}
