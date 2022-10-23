package Bitmanipulation.Assignment;

public class CountingBits {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        // int i=n;
        // while(n>=0){
        //     int count=0,val=n;
        //     while(val!=0){
        //         val=val&(val-1);
        //         count++;
        //     }
        //     res[i]=count;
        //     i--;n--;
        // }
        // return res;   TC : O(n^2)
        for(int i=1;i<=n;i++)
            res[i]=res[i>>1]+(i&1); //res[i]=res[i/2]+(i%2) are same
        return res; // TC : O(n)
    }
}
