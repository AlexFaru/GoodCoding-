// Problem name : RANDOM NODE

/* Description:

Random Node: You are implementing a binary search tree class from scratch, which, in addition
to insert, find, and delete, has a method getRandomNode() which returns a random node
from the tree. All nodes should be equally likely to be chosen. Design and implement an algorithm
for getRandomNode, and explain how you would implement the rest of the methods. */


public class BST{  //Wrap class for the Tree
	
	public TreNode getRandomNode(){
	
		TreeNode root = null;
		
		Random ran = new Random(){
			
			if(root == null)
				return null;
			
			int size = root.size;
			
			Random ran = new Random(); //Generate the random potition
			int i = ran.nextInt(size);
			return root.getIndexNode(i);
		}
		
		public void inserNode(int d){
			if (root == null)
				root = new TreeNode(d);
			else 
				root.makeInorder(d);
		}
		
	}
}

private clase TreeNode{
	int size;
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int d){
		size = 1;
		value = d;
		left =right = null;
	}
	
	public void makeInorder(int d){
		if(d < val){
			if(left == null)
				left = new TreeNode(d);
			else 
				left.makeInorder(d);
		}else{
			if(right == null)
				right = new TreeNode(d);
			else
				right.makeInorder(d);
		}
		size++;
	}
	
	public TreeNode getIndexNode(int index){
		int leftSize = left == null ? 0:left.size;
		
		if(leftSize < index){
			left.getIndexNode(index);
		}else if(index == leftsize){
			return this;
		}else{
			return right.getIndexNode(index-(leftSize+1)); //Make " index - nodes in left " to continue the inorder searching
		}
	}
}