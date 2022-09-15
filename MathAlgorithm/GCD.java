package MathAlgorithm;
import java.util.Scanner;
public class GCD {
    static int Gcd(int m,int n){
        if(m==0)
            return n;
        return Gcd(n%m,m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find a GCD:");
        int m=sc.nextInt(),n=sc.nextInt();
        System.out.println("The GCD is:"+Gcd(m,n));
    }
}
