package LC_CONTEST_First50_Problems;

public class LC_WEEKLY_CONTEST_263 {
    public boolean areNumbersAscending(String s) {
        int prev=0;
        for(String str:s.split(" ")){
            try{
                int num=Integer.parseInt(str);
                if(num<=prev) return false;
                prev=num;
            }catch(Exception e){}
        }
        return true;
    }
}
