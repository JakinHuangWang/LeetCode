import java.util.*;
//Use Two Arrays: one is Left product array and one is right product array
//At the end, product the two arrays together to get the answer;
public class LeetCode238 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		for(int num :productExceptSelf2(arr))
			System.out.println(num);
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int length = nums.length;
		int Left[] = new int[length];
		int Right[] = new int[length];
		
		Left[0]= 1;
        for(int i = 1; i < length; i++)
        	Left[i] = nums[i-1] * Left[i-1];
        Right[length-1] = 1;
        for(int i = length - 2; i >= 0; i--)
        	nums[i] = nums[i+1] * Right[i+1];
        return nums;
	}
	
//Only Using One Array
	public static int[] productExceptSelf2(int[] nums) {
		int length = nums.length;
		int answer[] = new int[length];
		answer[0] = 1;
		for(int i = 1; i < length; i++)
			answer[i] = nums[i-1] * answer[i-1];
		int right = 1;
		for(int i = length-2; i>=0; i--) {
			right = nums[i+1] * right;
			answer[i] = answer[i] * right;
		}
		return answer;
	}

}
