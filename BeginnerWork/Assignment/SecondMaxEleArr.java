package BeginnerWork.Assignment;

import java.util.Arrays;
import java.util.Scanner;
public class SecondMaxEleArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Using sort:"+arr[size-2]);
//        int fm=arr[0],sm=0;
//        for(int i=0;i<size;i++){
//            if(fm<arr[i]){
//                sm=fm;
//                fm=arr[i];
//                System.out.println(sm+" "+fm);
//            }
//        }
//        System.out.println("Two Pointers:"+sm);
    }
}
