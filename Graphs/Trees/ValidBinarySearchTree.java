/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * } 
 */
class Solution {
    long num = Long.MIN_VALUE;
    
    public boolean isValidBST(TreeNode root) {
        
        if(root==null)    //if node null does´t affects the inorder traversal 
            return true;
        
        if(!isValidBST(root.left)) //Check the left branch 
            return false;
        
        if(root.val<=num)  // if the definition of inOrder traversal is broken, then 
            return false;
        
        num = root.val;
        
        if(!isValidBST(root.right)) //Check the right breanch 
            return false;
        
        return true;  // Return true id the inOrder traversal y this subTree is find 
        
    }
}