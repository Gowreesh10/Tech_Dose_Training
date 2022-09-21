package Sorting.Homework;
import java.util.*;
public class CountSort {
    public static int[] sort(int[] arr, int n){
        int max=arr[0];
        for(int i=1; i<n; i++)
            max = Math.max(max,arr[i]);
        int[] count = new int[max+1];
        for(int i=0; i<n; i++)
            count[arr[i]]++;
        for(int i=1; i<=max; i++)
            count[i] += count[i-1];
        int[] output = new int[n];
        for(int i=n-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        int[] result = sort(arr,n);
        for(int i=0; i<n; i++)
            System.out.print(result[i]+" ");
    }
}
