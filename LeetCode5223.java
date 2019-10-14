import java.util.*;

public class LeetCode5223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution5223().queensAttacktheKing(new int[][]{{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}}, new int[]{3, 4}));
	}

}

class Solution5223{
	public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
		int chessboard[][] = new int[8][8];
		List<List<Integer>> ans = new ArrayList<>();
		for(int i = 0; i < queens.length; i++)
			chessboard[queens[i][0]][queens[i][1]] = 1;
		
		int x = king[0];
		int y = king[1];
		
		for(int i = x+1; i < 8; i++) {
			if(chessboard[i][y] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(i);
				temp.add(y);
				ans.add(temp);
				break;
			}
		}
		for(int i = x-1; i >= 0; i--) {
			if(chessboard[i][y] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(i);
				temp.add(y);
				ans.add(temp);
				break;
			}
		}
		for(int j = y+1; j < 8; j++) {
			if(chessboard[x][j] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x);
				temp.add(j);
				ans.add(temp);
				break;
			}
		}
		
		for(int j = y-1; j >= 0; j--) {
			if(chessboard[x][j] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x);
				temp.add(j);
				ans.add(temp);
				break;
			}
		}
		
		int m1 = Math.min(8-x, 8-y);
		int m2 = Math.min(x, y);
		int m3 = Math.min(x, 8-y);
		int m4 = Math.min(8-x, y);
		
		for(int i = 1; i <= m1 ; i++) {
			if(chessboard[x+i][y+i] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x+i);
				temp.add(y+i);
				ans.add(temp);
				break;
			}
		}
		
		for(int i = 1; i <= m2; i++) {
			if(chessboard[x-i][y-i] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x-i);
				temp.add(y-i);
				ans.add(temp);
				break;
			}
		}
		
		for(int i = 1; i <= m3; i++) {
			if(chessboard[x-i][y+i] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x-i);
				temp.add(y+i);
				ans.add(temp);
				break;
			}
		}
		
		for(int i = 1; i <= m4; i++) {
			if(chessboard[x+i][y-i] == 1) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x+i);
				temp.add(y-i);
				ans.add(temp);
				break;
			}
		}
		
		return ans;	
    }
}