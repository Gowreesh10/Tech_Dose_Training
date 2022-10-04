package BeginnerWork.Assignment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class subsequences_sum_k {
    static void subsequences_sum_k(int ind,int[] arr,List<Integer> list,int n,int sum,int resultsum){
        if(ind==n){
            if(sum==resultsum)
                System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        subsequences_sum_k(ind+1,arr,list,n,sum,resultsum);
        list.remove(list.size()-1);
        sum-=arr[ind];
        subsequences_sum_k(ind+1,arr,list,n,sum,resultsum);
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
        List<Integer> list=new ArrayList<>();
        subsequences_sum_k(0,arr,list,n,sum,resultsum);
    }
}
