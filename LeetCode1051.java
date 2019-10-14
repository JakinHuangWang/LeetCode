import java.util.Arrays;
public class LeetCode1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution1051().heightChecker(new int[] {1,1,4,2,1,3}));
	}

}

class Solution1051{
	public int heightChecker(int[] heights) {
        int[] ori = new int[heights.length];
        for(int i = 0; i < heights.length; i++) ori[i] = heights[i];
        
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i<heights.length; i++) {
        	if(ori[i] != heights[i])
        		count++;
        }
        return count;
    }	
}
