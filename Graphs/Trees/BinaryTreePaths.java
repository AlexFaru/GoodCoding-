


// Problem name : Binary TreePaths

/* Description:
Given a binary tree, return all root-to-leaf paths.
Note: A leaf is a node with no children.
 */

class Solution {
    List<String> paths = new ArrayList<String>();
   
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return paths;
        String str = "";
        makeList(root,str);
        return paths;
        
    }
    
    public void makeList (TreeNode node, String str){
        
        if(node == null)
            return;
        
            str += node.val +"->";
        
        if(node.left == null && node.right == null){
            paths.add(str.substring(0,str.length()-2));
        }
        
        makeList(node.left,str);
        makeList(node.right,str);
        
        String aux = String.valueOf(node.val);
        int lth = aux.length()+2;
        str = str.substring(0,str.length()-lth);
    }
}