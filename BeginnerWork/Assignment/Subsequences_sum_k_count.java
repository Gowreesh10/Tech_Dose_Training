package BeginnerWork.Assignment;
import java.util.Scanner;
public class Subsequences_sum_k_count {
    static int subsequences_sum_k_count(int ind,int[] arr,int sum,int resultsum,int n){
        if(ind==n){
            if(sum==resultsum) return 1;
            else return 0;
        }
        sum+=arr[ind];
        int l=subsequences_sum_k_count(ind+1,arr,sum,resultsum,n);
        sum-=arr[ind];
        int r=subsequences_sum_k_count(ind+1,arr,sum,resultsum,n);
        return l+r;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the sum value:");
        int resultsum=sc.nextInt();
        System.out.println(subsequences_sum_k_count(0,arr,sum,resultsum,n));
    }
}
//TC=O(2^n)