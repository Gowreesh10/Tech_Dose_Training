package Recursion.Homework;

import java.util.Scanner;

public class DivideAndConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        //calling merge sort method
        mergeSort(arr,0,arr.length-1);
        //printing the final array
        for(int i:arr)
            System.out.print(i+" ");
    }
    static void mergeSort(int[] arr,int low,int high){
        if(low==high)
            return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        //merge the divided elements in sorted way
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high+1];
        int i=low,j=mid+1,ind=low;
        while(i<=mid&&j<=high){
            if(arr[i]<arr[j])
                temp[ind++]=arr[i++];
            else temp[ind++]=arr[j++];
        }
        while(i<=mid) temp[ind++]=arr[i++];
        while(j<=high) temp[ind++]=arr[j++];
        for(int k=low;k<=high;k++){
            arr[k]=temp[k];
        }
    }

}
