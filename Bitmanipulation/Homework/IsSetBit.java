package Bitmanipulation.Homework;

public class IsSetBit {
    public static void main(String[] args) {
        int N=20,pos=3;
        if((N&(1<<pos-1))==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
