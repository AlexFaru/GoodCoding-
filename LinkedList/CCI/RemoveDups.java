public unsortedList(Node root){
      HashSet<Integer> map = new HashSet<>();//Set para guardar los numeros una sola vez.
      Node 
      if(head!=null){
            map.add(head.val);//Se agrega el valor del primer nodo, no puede estar repetido
            while(head.next != null){
                  if(map.contains(head.next.val)){//Si el dato se repite se elimina el nodo.
                        head.next = head.next.next; 
                  }else{ // Si el dato no se repite se agrega a la lista y se continua iterando 
                        map.add(head.next.val);
                        head = head.next;
                  }
            }
      }
}