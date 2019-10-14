import java.util.*;
public class LeetCode377 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution377().combinationSum4(new int[] {9}, 3));
		
	}

}

class Solution377 {
	 public int combinationSum4(int[] nums, int target) {
	        int ans[] = new int[target + 1];
	        ArrayList<Integer> arrLst = new ArrayList<>();
	        for(int num:nums) {if(target >= num)ans[num] = 1; arrLst.add(num);}
	        
	        for(int i=1; i<=target; i++){
	            for(int num : nums){
	                if(i - num >= 1)
	                    ans[i] += ans[i-num];
	            }
	        }
	        return ans[target];
	    }
}