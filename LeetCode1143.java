import java.util.*;
public class LeetCode1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.longestCommonSequence("ezupkr", "ubmrapg"));
	}

}

class Solution{
	public int longestCommonSequence(String text1, String text2) {
		int[][] rec = new int[text1.length() + 1][text2.length() + 1];
		for(int i = 1; i < rec.length; i++) {
			for(int j = 1; j < rec[i].length; j++) {
				if(text1.charAt(i-1) == text2.charAt(j-1))
					rec[i][j] += rec[i-1][j-1] + 1;
				else
					rec[i][j] = Math.max(rec[i-1][j], rec[i][j-1]);
			}
		}
		return rec[text1.length()][text2.length()];
	}
}
