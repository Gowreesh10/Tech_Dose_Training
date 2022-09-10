package BeginnerWork.Assignment;

import java.util.Scanner;

public class GCD_of_2_NO {
    //Euclidean algorithm
    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=a>b?a:b;
        int min=a<b?a:b;
        System.out.println(gcd(min,max));
    }
}
