//Return the kth to the last element of the list. 

public void kthToLast(Node root, int k){
     
     Node p1 = root;
     Node p2 = root; 
     
     for(int i =0; i<k;i++){
            if(p1==null)
                  return null;
            p1= p1.next; 
     }
     
     while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
     }
     
     return p2; 
}