import java.util.Arrays;

public class LeetCode33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 s = new Solution1();
		System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
	}

}

class Solution1 {
    public int search(int[] nums, int target) {
        int pivot = nums.length/2;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                pivot = i;
                break;
            }
        }
        int Left[] = Arrays.copyOfRange(nums, 0, pivot);
        int Right[] = Arrays.copyOfRange(nums, pivot, nums.length);
        int lf = BinarySearch(Left, target);
        int rf= BinarySearch(Right, target);
        
        if(lf == -1 && rf == -1)
        	return -1;
        else if(lf == -1)
        	return rf + pivot;
        else
        	return lf;
        
    }
    
    public int BinarySearch(int[] arr, int target) {
    	int start = 0, end = arr.length - 1, mid = (start + end)/2;
    	while(end >= start) {
    		if(arr[mid] == target) 
    			return mid;
    		else if(arr[mid] > target)
    			end=mid-1;
    		else
    			start=mid+1;
    		mid = (start + end)/2;
    	}
    	return -1;
    }
}