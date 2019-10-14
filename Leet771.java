import java.util.*;

public class Leet771 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution771{
	public int numJewelsInStones(String J, String S) {
        HashSet<Character> hash = new HashSet<>();
        for(char ch:J.toCharArray())
        	hash.add(ch);
        int sum = 0;
        for(char ch:S.toCharArray())
        	if(hash.contains(ch))
        		sum++;
        return sum;
    }
}
