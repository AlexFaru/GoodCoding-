import java.util.ArrayList;
import java.util.LinkedList; 
public class BST{

      ArrayList<LinkedList<Integer>> getList(TreeNode node){
            ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList>();
            
            if(node == null){
                  result.add(new LinkedList<Integer>());
                  return result;
            }
            
            LinkedList<Integer> prefix = new LinkedList<Integer>();
            prefix.add(node.data);
            
            ArrayList<LinkedList<Integer>> leftArray = (getList(node.left));
            ArrayList<LinkedList<Integer>> rightArray = (getList(node.right));
            
            for(LinkedList<Integer> left : leftArray){
                  for(LinkedList<Integer> rigth : rightArray){
                        ArrayList<LinkedList<Integer>> combi = 
                              new ArrayList<LinkedList>();
                              combis(left,right,combi,prefix);
                              result.addAll(combi);
                  }
            }
            return result;
      }
      
      public void combis(LinkedList<Integer> left,LinkedList<Integer> right, ArrayList<LinkedList<Integer>> list, LinkedList<Integer> prefix){
      
      
            if(left.size()==0||right.size()==0){
                  LinkedList<Integer> aux = (LinkedList<Integer>)prefix.clone();
                  aux.addAll(left);
                  aux.addAll(right);
                  list.add(aux);
            }
            
            int head = left.removeFirst();
            prefix.addLast(head);
            combis(left,right,list,prefix);
            prefix.removeLast();
            left.addFirst(head);
            
            int head = right.removeFirst();
            prefix.addLast(head);
            combis(left,right,list,prefix);
            prefix.removeLast();
            right.addFirst(head);
      }


}