package Search_Algorithm.BinarySearch;
import java.util.Scanner;

public class SearchElementsInSortedArray {
    //iterative approach
    static int iterativeBS(int[] arr,int low,int high,int val1){
        while(high>=low){
            int mid=low+(high-low)/2;
            if(val1==arr[mid]) return mid;
            else if(val1>arr[mid]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    //recursive approach
    static int recursiveBS(int[] arr,int low,int high,int val){
        if(high>=low){
            int mid=low+(high-low)/2;
            if(val==arr[mid]) return mid;
            if(val>arr[mid]) return recursiveBS(arr,mid+1,high,val);
            if(val<arr[mid]) return recursiveBS(arr,low,mid-1,val);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the value to get searched(recursive): ");
        int val=sc.nextInt();
        System.out.println("Located at: "+recursiveBS(arr,0, arr.length,val));
        System.out.println("Enter the value to get searched(iterative): ");
        int val1=sc.nextInt();
        System.out.println("Located at: "+iterativeBS(arr,0,arr.length,val1));
    }
}
