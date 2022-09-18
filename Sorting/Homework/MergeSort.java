package Sorting.Homework;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        mergeSort(a,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void mergeSort(int[] a,int low ,int high)
    {
        if(high == low)
            return ;
        int mid = low+(high-low)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,high,mid,low);
    }
    public static void merge(int[] a, int high, int mid, int low)
    {
        int i = low,j=mid+1;
        int[] m = new int[high+1];
        int k = low;
        while(i<=mid && j<=high){
            if(a[i] > a[j]){
                m[k++] = a[j];
                j++;
            }
            else{
                m[k++] = a[i];
                i++;
            }
        }
        while(i<=mid)
            m[k++] = a[i++];
        while(j<=high)
            m[k++] = a[j++];
        for(int index=low;index<=high;index++)
            a[index] = m[index];
    }
}
