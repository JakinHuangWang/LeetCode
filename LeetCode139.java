import java.util.*;
import java.lang.String;
public class LeetCode139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = Arrays.asList(new String[] {"leet","code"});
		
		System.out.println(new Solution139().wordBreak("leetcode", lst ));
	}

}

class Solution139{
	    public boolean wordBreak(String s, List<String> wordDict) 
	    {
	        Set<String> hash = new HashSet<>();
	        for (String word : wordDict) hash.add(word);
	        
	        boolean rec[] = new boolean[s.length() + 1];
	        rec[0] = true;
	        for (int i = 1; i < rec.length; i++) {
	            for (int j = 1; j <= i; j++) {
	                String between = s.substring(j-1, i);
	                if (rec[j-1] && hash.contains(between)){
	                    rec[i] = true;
	                    break;
	                }
	            }
	        }
	        
	        return rec[rec.length-1];
	    }
	    
}
