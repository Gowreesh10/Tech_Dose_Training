package Bitmanipulation;
class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int i=0,d=0;
        while(xor>>i!=0){
            if(((xor>>i)&1)==1)
                d++;
            i++;
        }
        return d;
    }
}