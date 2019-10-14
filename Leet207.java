import java.util.*;

public class Leet207 {

	public static void main(String[] args) {
		System.out.println(new Solution207().canFinish(4, new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}}));

	}
}

class Solution207{
	
	private static final int NOTVISIT = 0;
	private static final int VISIT = 1;
	private static final int END = 2;
	
	public boolean DFS(HashMap<Integer, List<Integer>> g, int course, int[] help){
		  if(help[course] != NOTVISIT)
			  return help[course] == END;
          help[course] = VISIT;
		  if(g.containsKey(course)) {
		  for(int c:g.get(course)) {
			  if(!DFS(g, c, help))
			    return false;
			  }
		  }
          help[course] = END;
	      return true;
	  }
		
		public boolean canFinish(int numCourses, int[][] prerequisites) {
			if(numCourses <= 1) return prerequisites.length == 0;
			HashMap<Integer, List<Integer>> g = new HashMap<>();
	        List<Integer> flag = new ArrayList<>();
	        for(int i = 0; i < numCourses; i++) flag.add(0);

	        for(int i = 0; i < prerequisites.length; i++) {
	        	int left = prerequisites[i][0], right = prerequisites[i][1];
	        	List<Integer> lst;
	        	if(g.containsKey(right)) {
	        		lst = g.get(right);
	        		lst.add(left);
	        	}else {
	        		lst = new ArrayList<>();
	        		lst.add(left);
	        	}
	        	g.put(right, lst);	
	        }
			int help[] = new int[numCourses];
			
	        for(int course = 0; course < numCourses; course++)
	        	if(help[course] == NOTVISIT && !DFS(g, course, help))
	        		return false;
	        return true;
	    }
		
}
