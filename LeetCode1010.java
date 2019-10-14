import java.util.HashMap;
public class LeetCode1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution1010{
	 public int numPairsDivisibleBy60(int[] time) {
	        HashMap<Integer, Integer> pairs = new HashMap<>();
	        int count = 0;
	        for(int t:time) {
	        	int left = 60 - t%60;
	        	if(pairs.containsKey(60 - t % 60))
	        		count += pairs.get(left);
	        	pairs.put(t%60, pairs.getOrDefault(t%60, 0)+1);
	        }
	        return count;
	    }
}