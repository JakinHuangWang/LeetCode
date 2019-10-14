import java.util.*;
public class LeetCode217 {

	public static void main(String[] args) {

	}
	
	public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num))
            	return false;
            else
            	map.put(num, num);
        }
        return true;
    }

}
