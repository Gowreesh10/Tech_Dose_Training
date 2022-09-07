package Bitmanipulation.Homework;

 class FlipIthBit {
    public static void main(String[] args) {
        int a=12,pos=3;
        System.out.println(a^(1<<pos-1));
    }
}
