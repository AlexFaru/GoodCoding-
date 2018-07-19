// Write code to partition a liked List around a value (variable value). 

/* Definition of Node 
class Node{
      int val;
      Node next;
      public Node(int val){
            this.val = val
            next = null;
      }
}

*/

public Node partitionList(Node root,int value){

      Node head= root; //Helps to keep track of the head of list
      Node tail= root; //Helps to keep track of the tail of list
      
      while(root != null){
            Node next = root.next;
            if(root.val< value){ // Update head
                  root.next = head; 
                  head = root;
            }else{              // Update tail 
                  tail.next= root;
                  tail = tail.next;
            }
            root = next;
      }
      tail.next = null;
      
      return head; 
}