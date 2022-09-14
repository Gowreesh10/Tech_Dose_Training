package Sorting.Homework;
import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        System.out.println("Enter the array to sort it using brute force: ");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
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
        //selection sort
        System.out.println("Enter the array to sort using selection sort: ");
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(arr1[ind]>arr1[j])
                    ind=j;
            }
            int temp=arr1[i];
            arr1[i]=arr1[ind];
            arr1[ind]=temp;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        for (int i=0;i<n;i++)
            System.out.print(arr1[i]+" ");
    }
}
