package BeginnerWork.Assignment;
import java.util.*;
public class P9_Mean_Median_Mode_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        double meanres=0.d;
        int moderes,medianres;
        int[] hash = new int[1000];
        for (int i:arr) {
            hash[i]++;
            meanres+=i;
        }
        //mean
        System.out.println("The mean is:"+meanres/n);
        //median
        if((n&1)!=1)
            medianres=(arr[n/2]+arr[(n/2)-1])/2;
        else
            medianres=arr[n/2];
        System.out.println("The median is:"+medianres);
        //mode
        moderes=Integer.MIN_VALUE;
        for(int i=0;i<hash[arr.length-1];i++){
            if(moderes<hash[i])
                moderes=i;
        }
        System.out.println("The mode is:"+moderes);
    }
}
