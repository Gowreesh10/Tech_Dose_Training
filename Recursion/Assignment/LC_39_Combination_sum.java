package Recursion.Assignment;

import java.util.ArrayList;
import java.util.List;

public class LC_39_Combination_sum {
    static void combination(int ind, int[] candidates, int target, List<List<Integer>> res, List<Integer> list){
        //base case
        if(ind==candidates.length){
            if(target==0)
                res.add(new ArrayList<>(list));
            return;
        }
        //pick condition
        if(candidates[ind]<=target){
            list.add(candidates[ind]);
            combination(ind,candidates,target-candidates[ind],res,list);
            list.remove(list.size()-1);
        }
        //not pick
        combination(ind+1,candidates,target,res,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        combination(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}
