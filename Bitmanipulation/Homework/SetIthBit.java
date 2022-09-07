package Bitmanipulation.Homework;

public class SetIthBit {
    public static void main(String[] args) {
        int N=20,pos=3;
        System.out.println(N|(1<<pos-1));
    }
}
