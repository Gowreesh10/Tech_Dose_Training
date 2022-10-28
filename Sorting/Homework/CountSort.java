package Sorting.Homework;
import java.util.*;
public class CountSort {
    static int max(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>res)
                res=arr[i];
        }
        return res;
    }
    static void countSort(int[] arr,int n){
        int maxele=max(arr);
        int[] freq=new int[maxele+1];
        int[] res=new int[n];
        //counting the frequency of elements in the array
        for(int i=0;i<n;i++)
            freq[arr[i]]++;
        //cumulative frequency
        for(int i=1;i<=maxele;i++)
            freq[i]=freq[i]+freq[i-1];
        //sorting
        for(int i=0;i<n;i++)
            res[--freq[arr[i]]]=arr[i];
        //printing
        for(int i: res)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        countSort(arr,n);
    }
}
