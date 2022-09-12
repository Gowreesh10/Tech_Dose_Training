package BeginnerWork.Assignment;
import java.util.Scanner;
public class P4_Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt(),y1= sc.nextInt();
        int x2= sc.nextInt(),y2= sc.nextInt();
        int x3= sc.nextInt(),y3= sc.nextInt();
        int d1=x1*(y2-y3),d2=x2*(y3-y1),d3=x3*(y1-y2);
        System.out.println("The area is "+((d1+d2+d3) /2)+" sq units");
    }
}
