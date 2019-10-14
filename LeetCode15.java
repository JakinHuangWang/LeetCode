import java.util.*;
public class LeetCode15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution15 s = new Solution15();
		System.out.println(s.threeSum(new int[] {1, 4, 45, 6, 10, 8 }));
		Set<List<Integer>> set2 = new HashSet<>(s.threeSum(new int[] {1, 4, 45, 6, 10, 8 }));
	}

}

class Solution15{
    public List<List<Integer>> threeSum(int[] nums) {
	      List<List<Integer>> arrLst = new ArrayList<>();
          Arrays.sort(nums);
          for(int i = 0; i < nums.length; i++){
              if(i > 0 && nums[i] == nums[i-1]) continue;
              int front = i+1, end = nums.length-1;
              while(front < end){
                  if(nums[front] + nums[end] == -nums[i]){
                      arrLst.add(Arrays.asList(nums[i], nums[front], nums[end]));
                      front++;
                      end--;
                      while(front < end && nums[front] == nums[front-1]) front++;
                      while(front < end && nums[end] == nums[end+1]) end--;
                  }
                  else if(nums[front] + nums[end] > -nums[i])
                      end--;
                  else
                      front++;
              }
          }
	      return arrLst;
	 }   
}