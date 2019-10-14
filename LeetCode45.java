
public class LeetCode45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution45().jump(new int[] {2}));
	}

}

class Solution45{
	public int jump(int[] nums) {
	        int[] ans = new int[nums.length];
	        ans[0] = 0;
	        for(int i = 0; i < nums.length; i++) {
	        	for(int j = 1; j <= nums[i]; j++) {
	        		int afterstep = i + j;
	        		if(afterstep >= nums.length) break;
	        		if(i == 0)
	        			ans[afterstep] = ans[i] + 1;
	        		if(ans[i] != 0 && ans[afterstep] == 0)
	        			ans[afterstep] = ans[i] + 1;
	        		else if(ans[i] != 0)
	        			ans[afterstep] = Math.min(ans[i] + 1, ans[afterstep]);
	        	}
	        }
	        for(int num:ans) System.out.print(num+", ");
	        System.out.println();
	        return ans[nums.length-1];
	}
}