package BeginnerWork.Assignment;

import java.util.Scanner;

public class P12_Factorial {
    //recursion
    static int factorial1(int n){
        if(n<=1)
            return 1;
        return n*factorial1(n-1);
    }
    //memoization

    //Dynamic programming
    static int factorial2(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        for (int i=1;i<=n;i++){
            dp[i]=i*dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The factorial using recursion:"+factorial1(n));
        System.out.println("The factorial using dp:"+factorial2(n));

    }
}
