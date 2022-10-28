package Sorting.Homework;
import java.util.Scanner;
/*
 * Sentence to be remembered: Repeatedly swap two adjacent elements of they are in wrong order,
 * If we do that we can push the maximum element to the last
 * */
public class bubbleSort {
    static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=n-1;i>0;i--){
            boolean isswap=false;
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]) {
                    swap(i,j,arr);
                    isswap=true;
                }
            }
            if(!isswap) break;
        }
        System.out.print("The array after bubble sort is ");
        for(int i:arr)
            System.out.print(i+" ");
    }
}
/*
* TC:
* best case:O(N) if already sorted
* worst case:O(N^2) if sorted in reverse
* average case:O(N^2) if arranged random
* */
