import java.util.*;
public class LeetCode811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Solution811().subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
	}

}

class Solution811{
	public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hash = new HashMap<>();
        for(String s:cpdomains) {
        	String[] cppair = s.split(" ");
        	String[] component = cppair[1].split("\\.");
        	String res = "";
        	for(int i = component.length - 1; i >= 0 ; i--) {
        		if(i < component.length-1)
        			res = component[i] + "." + res;
        		else
        			res = component[i] + res;
        		hash.put(res, hash.getOrDefault(res, 0) + Integer.parseInt(cppair[0]));
        	}  	
        }
        
        List<String> ans = new ArrayList<>();
        for(String k:hash.keySet())
        	ans.add((hash.get(k)).toString() + " " + k);
        return ans;
    }
}