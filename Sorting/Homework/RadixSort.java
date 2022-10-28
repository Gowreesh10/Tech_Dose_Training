package Sorting.Homework;
import java.util.*;
public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int maxele=max(arr,n);
        for(int exp=1;maxele/exp>0;exp*=10){
            radixSort(arr,exp,n);
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
    static void radixSort(int[] arr,int exp,int n){
        int[] freq=new int[10];
        int[] res=new int[n];

        for(int i=0;i<n;i++)
            freq[(arr[i]/exp)%10]++;

        for(int i=1;i<10;i++)
            freq[i]=freq[i]+freq[i-1];

        for(int i=0;i<n;i++)
            res[freq[(arr[i]/exp)%10]-1]=arr[i];

        for(int i=0;i<n;i++)
            arr[i]=res[i];
    }
    static int max(int[] arr,int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>res)
                res=arr[i];
        }
        return res;
    }
}
