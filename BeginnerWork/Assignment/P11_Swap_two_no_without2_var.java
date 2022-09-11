package BeginnerWork.Assignment;

import java.util.Scanner;

public class P11_Swap_two_no_without2_var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b= sc.nextInt();
        //xor
        a^=b;
        b^=a;
        a^=b;
        System.out.println("After swap Using xor:"+a+","+b);
        //normal
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Normal swap:"+a+","+b);
    }
}
