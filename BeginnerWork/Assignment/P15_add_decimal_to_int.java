package BeginnerWork.Assignment;
import java.util.Scanner;
public class P15_add_decimal_to_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        int val= sc.nextInt();
        System.out.printf("%.1f", n+val);
    }
}
