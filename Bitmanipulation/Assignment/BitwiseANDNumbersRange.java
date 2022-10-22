package Bitmanipulation.Assignment;

public class BitwiseANDNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        // int res=left;
        // for(int i=left+1;i<=right;i++)
        //     res&=i;
        // return res; TLE

        while(left<right)
            right=right&(right-1); //Brain Keringhan algo
        return right;
    }
}
