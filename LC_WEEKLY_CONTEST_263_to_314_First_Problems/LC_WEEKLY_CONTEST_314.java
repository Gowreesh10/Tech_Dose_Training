package LC_WEEKLY_CONTEST_263_to_314_First_Problems;

public class LC_WEEKLY_CONTEST_314 {
    public int hardestWorker(int n, int[][] logs) {
        int longest=logs[0][1];
        int id=logs[0][0];
        for(int i=1;i<logs.length;i++){
            if(logs[i][1]-logs[i-1][1]>longest){
                longest=(logs[i][1]-logs[i-1][1]);
                id=logs[i][0];
            }
            else if(logs[i][1]-logs[i-1][1]==longest){
                longest=(logs[i][1]-logs[i-1][1]);
                id=id<logs[i][0]?id:logs[i][0];
            }
        }
        return id;
    }
}
