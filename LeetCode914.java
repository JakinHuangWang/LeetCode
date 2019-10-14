import java.util.*;
public class LeetCode914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution914().hasGroupsSizeX(new int[] {1,2,3,4,4,3,2,1}));
	}

}

class Solution914{
public boolean hasGroupsSizeX(int[] deck) {
		if(deck.length == 0) return false;
		
        Arrays.sort(deck);
        List <Integer> l = new ArrayList<>();
        int p = deck[0];
        int count = 0;
        for(int i = 0; i < deck.length; i++) {
        	if(deck[i] == p)
        		count++;
        	else {
        		l.add(count);
        		p = deck[i];
        		count = 1;
        	}
        }
        l.add(count);
        int min = Integer.MAX_VALUE;
        for(int num:l) {
        	if(num == 1) return false;
        	if(num < min) min = num;
        }
        
        for(int i = 2; i <= min; i++) {
        	boolean b = true;
        	for(int num:l) {
        		b &= (num % i == 0);
        		if(!b) break;
        	}
        	if(b) return b;
        }
        
        return false;
    }
}