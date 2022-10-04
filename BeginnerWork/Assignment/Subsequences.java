package BeginnerWork.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequences {
    static void subSequence(int ind, int[] arr, List<Integer> list, int n){
        if(ind>=n){
            System.out.print(list);
            System.out.println();
//            if(list.size()==0){
//                System.out.println("{}");
//            }
            return;
        }
        list.add(arr[ind]);
        subSequence(ind+1,arr,list,n);
        list.remove(list.size()-1);
        subSequence(ind+1,arr,list,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        subSequence(0,arr,list,n);
    }
}

