
public class LeetCode198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution198{
	    public int rob(int[] nums) {
	        int res[] = new int[nums.length];
	        if(nums.length == 0) return 0;
	        if(nums.length >= 1)
	            res[0] = nums[0]; 
	        if(nums.length >= 2)
	            res[1] = nums[1];
	        
	        for(int i = 2; i < res.length; i++){
	            for(int j = 0; j <= i - 2; j++){
	                res[i] = Math.max(res[i], res[j]);
	            }
	            res[i] += nums[i];
	        }
	        
	        int max = Integer.MIN_VALUE;
	        for(int num: res)
	            if(num > max) max = num;
	        return max;
	    }
}
