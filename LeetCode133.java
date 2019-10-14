import java.util.*;

public class LeetCode133 {

	public static void main(String[] args) {
		Node node = new Node();
		new Solution133().cloneGraph(new Node());

	}

}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};

class Solution133{
	 public Node cloneGraph(Node node) {
		 HashMap<Node, Node> map = new HashMap<>();
		    Queue<Node> q = new LinkedList<>();
		    List<Node> neighs = new ArrayList<Node>();
		    Node cloneNode = new Node(node.val, new ArrayList<Node> ());
		    for(Node n : node.neighbors) {
		    	cloneNode.neighbors.add(new Node(n.val, new ArrayList<Node>()));
		    }
		    q.add(cloneNode);
		    map.put(node, cloneNode);
		    
		    while(!q.isEmpty()) {
		    	Node next = q.poll();
		    	for(Node n : next.neighbors) {
		    		if(!map.containsKey(n)) {
		    			q.add(n);
		    			List<Node> cloneLst = new ArrayList<>();
		    			for(Node cn : n.neighbors)
		    				cloneNode.neighbors.add(new Node(cn.val, new ArrayList<Node>()));
		    			Node newnode = new Node(n.val, cloneLst);
		    		    map.put(n, newnode);
		    		}
		    	}
		    }
		    System.out.println(map);
	        return cloneNode;
	    }
}
