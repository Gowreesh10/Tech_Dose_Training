package Bitmanipulation.Homework;

public class IsPowerOf2 {
    public static void main(String[] args) {
        int a=7;
        if((a&(a-1))==0)
            System.out.println("power of two");
        else
            System.out.println("Not a power of two");
    }
}
