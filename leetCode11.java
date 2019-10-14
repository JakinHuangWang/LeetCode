
public class leetCode11 {

	public static void main(String[] args) {
		Solution11 s = new Solution11();
		System.out.println(s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
	}

}

//O(n^2) Solution
class Solution11{
	public int maxArea(int[] height) {
		int area = 0;
        for(int i = 0; i < height.length-1; i++) {
        	for(int j = i+1; j < height.length; j++) {
        		area = Math.max(area, (j-i)*Math.min(height[i], height[j]));
        	}
        	}
        return area;
    }
}

//O(n) Solution
class Solution11_2 {
		   public int maxArea(int[] height) {
				int area = 0, start = 0, end = height.length-1;
		        while(start < end){
		            area = Math.max(area, (end-start)*Math.min(height[start], height[end]));
		            if(height[start] > height[end])
		                end--;
		            else
		                start++;
		        }
		        return area;
		    }
}
