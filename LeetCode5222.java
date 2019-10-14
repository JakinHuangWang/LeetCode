
public class LeetCode5222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution5222().balancedStringSplit("LLLRRRLRLRLRLRLLLLRRRRLRLRLRLR"));
	}

}

class Solution5222{
public int balancedStringSplit(String s) {
		int total = 0, rcount = 0, lcount = 0;
		if(s.length() == 1) return 1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R')
				rcount += 1;
			if(s.charAt(i) == 'L')
				lcount += 1;
			if(rcount == lcount) {
				total += 1;
				rcount = 0;
				lcount = 0;
			}
		}
		return total;
    }
}
