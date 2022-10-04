package BeginnerWork.Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class subsequences_sum_any1 {
    static boolean subsequences_sum_any1(int ind,int[] arr,List<Integer> list,int n,int sum,int resultsum){
        if(ind==n){
            if(sum==resultsum){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        if(subsequences_sum_any1(ind+1,arr,list,n,sum,resultsum)==true) return true;
        list.remove(list.size()-1);
        sum-=arr[ind];
        if(subsequences_sum_any1(ind+1,arr,list,n,sum,resultsum)==true) return true;
        return false;
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
        subsequences_sum_any1(0,arr,list,n,sum,resultsum);
    }
}
