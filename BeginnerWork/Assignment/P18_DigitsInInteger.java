package BeginnerWork.Assignment;
import java.util.*;
public class P18_DigitsInInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long num = sc.nextLong();
        P18_DigitsInInteger.display(num);
    }
    static void display(long n){
        if(n==0)
            return;
        long r=n%10;
        display(n/10);
        System.out.print(r+" ");
    }
}
