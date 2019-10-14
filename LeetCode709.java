
public class LeetCode709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution709().toLowerCase("LOVELY"));
	}

}

class Solution709{
	 public String toLowerCase(String str) {
	        String ans = "";
	        for(char ch:str.toCharArray()) {
	        	int ascii = (int) ch;
	        	if(ascii <= 90 && ascii >= 65)
	        		 ans += (char)(ascii+32);
	        	else
	        		ans += (char) ascii;
	        }
	        return ans;
	    }
}