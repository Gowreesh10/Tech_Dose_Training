package Bitmanipulation.Homework;

public class Swap {
    public static void main(String[] args) {
        int a=5,b=6;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping:"+a+" "+b);
    }
}
