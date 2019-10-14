import java.util.*;
public class LeetCode922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

class Solution922{
	 public int[] sortArrayByParityII(int[] A) {
	        List<Integer> odd = new ArrayList<>();
	        List<Integer> even = new ArrayList<>();
	        
	        for(int num : A) {
	        	if(num % 2 == 0) even.add(num);
	        	else odd.add(num);
	        }
	        int index = 0;
	        for(int i = 0; i < A.length; i++) {
	        	if(index % 2 == 0 && index != 0) index++;
	        	if(i % 2 == 0) {
	        		A[i] = even.get(index);
	        		even.remove(index);
	        	}else {
	        		A[i] = odd.get(index);
	        		odd.remove(index);
	        	}
	        }
	        return A;
	    }
}