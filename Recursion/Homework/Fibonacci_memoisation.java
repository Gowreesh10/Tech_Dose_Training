package Recursion.Homework;
import java.util.*;
public class Fibonacci_memoisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
    }
    public static int fib(int n,int[] dp)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        return fib(n-1,dp)+fib(n-2,dp);
    }
}
