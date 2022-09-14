package Sorting.Homework;
import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        //selection sort
        System.out.println("Enter the array to sort using selection sort: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[ind]>arr[j])
                    ind=j;
            }
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
}
