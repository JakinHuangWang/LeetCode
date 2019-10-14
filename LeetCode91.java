
public class LeetCode91 {

	public static void main(String[] args) {
		System.out.println(new Solution91().numDecodings("222222222"));
	}

}

class Solution91{
	    public int numDecodings(String s) {
	        int rec[] = new int[s.length()];
	        if(s.charAt(0) == '0') return 0;
	        if(s.length() == 0 || s.length() == 1) return s.length();
	        rec[0] = 1;
	        int num = Integer.parseInt(s.substring(0, 2));
	        
	        if(num % 10 == 0){
	            if(num > 26) return 0;
	            else rec[0] = rec[1] = 1;
	        }
	        else if(num >= 1 && num <= 26){rec[1] = 2;}
	        else{rec[1] = 1;}
	        
	        for(int i = 2; i < s.length(); i++) {
	        		num = Integer.parseInt(s.substring(i-1, i+1));
	                if(num == 0) return 0;
	                else if(num % 10 == 0){
	                    if(num <= 26){rec[i] = rec[i-2];}
	                    else{return 0;}
	                }
	        		else if(num >= 1 && num <= 26){
	        		if(s.charAt(i-1) == '0')
	        		     rec[i] = rec[i-1];
	        		else
	                    rec[i] = rec[i-1] + rec[i-2];
	        }
	            else rec[i] = rec[i-1];
	        }
	        return rec[s.length()-1];
	    }
}
