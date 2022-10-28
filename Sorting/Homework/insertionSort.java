package Sorting.Homework;
import java.util.*;
/*
 * Sentence to be remembered:Insert an element from an unsorted array to its correct position in sorted array
 * */
public class insertionSort {
    static void insertionSort1(int[] arr,int n){
        for(int i=0;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i:arr)
            System.out.print(i+" ");
    }

    static void insertionSort2(List<Integer> list,int val){
        list.add(val);
        for(int i=list.size()-1;i>=1;i--){
            if(list.get(i)>list.get(i-1)) break;
            Collections.swap(list,i,i-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for insertion sort1
        int[] arr = new int[n];
        System.out.println("Insertion sort1 ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        insertionSort1(arr,n);

        System.out.println();
        //insertion sort2
        System.out.println("Insertion sort2 ");
        List<Integer> list = new ArrayList<>();
        while(n>0){
            insertionSort2(list,sc.nextInt());
            n--;
        }
        for(int i:list)
            System.out.print(i +" ");
    }
}

/*
 * TC:
 * Best Case : O(N) // Array elements are coming in sorted way
 * Worst Case : O(N^2) // Array sorted in reverse order
 * Avg Case : O(N^2) // Array in random order
 */
