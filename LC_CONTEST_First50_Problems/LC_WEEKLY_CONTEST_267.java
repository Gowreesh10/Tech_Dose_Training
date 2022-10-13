package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_267 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        while(true){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]==0) continue;
                tickets[i]--;
                count++;
                if(tickets[k]==0) return count;
            }
        }
    }
}
