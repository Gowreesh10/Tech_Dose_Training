package Bitmanipulation.Homework;

public class RightMostSetBit {
    public static void main(String[] args) {
        int N=8;
        System.out.println(N&(~N+1));
    }
}
