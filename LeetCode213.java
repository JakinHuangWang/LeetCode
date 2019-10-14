
public class LeetCode213 {
	public static void main(String[] args) {
		System.out.println(new Solution213().rob(new int[] {1,2,3,1}));

	}
}

class Solution213{
	 public int rob(int[] nums) {
	        int res[] = new int[nums.length];
	        if(nums.length == 0) return 0;
	        if(nums.length >= 1)
	            res[0] = nums[0]; 
	        if(nums.length >= 2)
	            res[1] = nums[1];
	        
	        for(int i = 2; i < res.length; i++){
	        	int j;
	        	if(i == res.length-1) j = 1;
	        	else j = 0;
	            for(; j <= i - 2; j++){
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
