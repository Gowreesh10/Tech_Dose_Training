package Sorting.Homework;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        System.out.println("Enter the elements(bf)");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the elements for bubble sort");
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        //brute force
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("The array after (brute force)sorting ");
        for (int i:arr)
            System.out.print(i+" ");
        //bubble sort
        for(int i=n-1;i>0;i--){
            boolean isSwap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap)
                break;
        }
        System.out.println();
        System.out.print("The array after bubble sort is ");
        for(int i:arr1)
            System.out.print(i+" ");
    }
}
