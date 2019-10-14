import java.util.*;
public class LeetCode896 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution896{
	public boolean isMonotonic(int[] A) {
		ArrayList<Integer> unique = new ArrayList<>();
        if(A.length == 1 || A.length == 0 || A.length == 2) return true;
        for(int i = 0; i < A.length; i++){
            if(!unique.contains(A[i])) {
            	if(unique.size() == 3) {
            		int first = unique.get(0), second = unique.get(1), third = unique.get(2);
            		if(second > first && second > third) return false;
            		if(second < first && second < third) return false;
            		unique.remove(0);
            	}
            	else unique.add(A[i], 0);
            }
        }
        return true;
    }
}