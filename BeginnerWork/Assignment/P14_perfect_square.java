package BeginnerWork.Assignment;

import java.util.Scanner;

public class P14_perfect_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if((Math.sqrt(n)*Math.sqrt(n))==n)
            System.out.println("Perfect square");
        else
            System.out.println("Not perfect square");
    }
}
