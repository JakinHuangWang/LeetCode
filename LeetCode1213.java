import java.util.*;
public class LeetCode1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Solution1213().arraysIntersection());

	}

}

class Solution1213{
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        TreeMap <Integer,Integer> map = new TreeMap<>();
        LinkedList<Integer> ans = new LinkedList<>();
        for(int num:arr1)
        	map.put(num, map.getOrDefault(map.get(num)+1, 1));
        for(int num:arr2)
        	map.put(num, map.getOrDefault(map.get(num)+1, 1));
        for(int num:arr3)
        	map.put(num, map.getOrDefault(map.get(num)+1, 1));
        for(int k:map.keySet())
        	if(map.get(k) == 3)
        		ans.add(k);
        return ans;
    }
}