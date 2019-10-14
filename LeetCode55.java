
public class LeetCode55 {

	public static void main(String[] args) {
		new Solution55().canJump(new int[] {3,2,1,0,4});
	}

}

class Solution55{
	public boolean canJump(int[] nums) {
        boolean[] ans = new boolean[nums.length];
        ans[0] = true;
        for(int i = 0; i < nums.length; i++) {
        	for(int j = 1; j <= nums[i]; j++) {
        		int afterstep = i + j;
        		if(afterstep >= nums.length) break;
        		if(ans[i]) ans[afterstep] = true;
        	}
        	System.out.println(ans[i]);
        }
        return ans[nums.length-1];
    }
}