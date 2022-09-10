package BeginnerWork.Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class P1_SecondMaxEleArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int fm=Integer.MIN_VALUE;
        int sm=fm;
        //Two pointers
        for(int i=0;i<size;i++){
            if(arr[i]>fm){
                sm=fm;
                fm=arr[i];
            }else if(arr[i]>sm&&arr[i]<fm){
                sm=arr[i];
            }
        }
        System.out.println("Two Pointers:"+sm);
        //sorting
        Arrays.sort(arr);
        System.out.println("Using sort:"+arr[size-2]);
    }
}
