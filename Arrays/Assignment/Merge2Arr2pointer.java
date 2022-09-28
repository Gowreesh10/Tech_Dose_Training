package Arrays.Assignment;

public class Merge2Arr2pointer {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10,11};
        int len=arr1.length+arr2.length;
        //int[] res=new int[len];
        int val=len;
        int p1=0,p2=0;
        while(val>0){
            if(arr1[p1]<arr2[p2]){
//                res[len-val]=arr1[p1];
                System.out.print(arr1[p1]+" ");
                p1++;
            }
            else {
                System.out.print(arr2[p2]+" ");
                p2++;
            }
            System.out.println(val);
            val--;
        }
    }
}