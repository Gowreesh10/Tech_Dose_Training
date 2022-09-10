package BeginnerWork.Assignment;
import java.util.*;
public class P3_LCM_of_2_NO {
    static int gcd(int m,int n){
        if(m==0)
            return n;
        return gcd(n%m,m);
    }
    static int lcm(int m,int n){
        int max=m>n?m:n;
        int min=m<n?m:n;
        return (m*n)/gcd(min,max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        System.out.println(lcm(m,n));
    }
}
