package Sorting.Homework;
import java.util.*;
/*
* Sentence to be remembered: Find the minimum element in unsorted array and swap it with a beginning
* */
public class selectionSort {
    static void swap(int i,int minIndex,int[] arr){
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //selection sort
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            swap(i,minIndex,arr);
        }

        for(int i:arr)
            System.out.print(i+" ");
    }
}
/*
* Tc :
* best case:O(N^2)
* worst case:O(N^2)
* average case:O(N^2)
* */