package MathAlgorithm;
import java.util.Scanner;
public class primeOrNot {
    static String isPrime(int n){
        if(n==1)
            return "Not a prime";
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return "Not a prime";
        }
        return "a prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The Number is "+isPrime(n));
    }
}
