import java.util.*;
public class LeetCode1200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution1200().minimumAbsDifference(new int[] {1,3,6,10,15}));

	}

}

class Solution1200{
public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] - arr[i-1] < min)
        		min = arr[i] - arr[i-1];
        }
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] - arr[i-1] == min)
            	ans.add(Arrays.asList(arr[i-1], arr[i+1]));
        }
        return ans;
    }
}