package BeginnerWork.Assignment;
import java.util.Scanner;
public class P10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int l=0,r=str.length()-1,flag=1;
        while (r-->l++){
            if(str.charAt(r)!=str.charAt(l)){
                System.out.println("Not a palindrome");
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("Palindrome");
    }
}
