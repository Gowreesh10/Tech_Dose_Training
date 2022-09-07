package Bitmanipulation.Homework;

/**
 * UnsetIthBit
 */
public class UnsetIthBit {
    public static void main(String[] args) {
        int N=15,pos=3;
        System.out.println(N&~(1<<pos-1));
    }
    
}