package BeginnerWork.Assignment;
import java.util.Scanner;
public class P8_Sum_of_N_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //Using formula
        System.out.println("Without using iteration:"+(n*((n+1)/2)));
        int val=0;
        //Using for loop
        for(int i=1;i<=n;i++)
            val+=i;
        System.out.println("Using iteration:"+val);
    }
}
