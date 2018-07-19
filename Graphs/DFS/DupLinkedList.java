
// This solution if for: Not Buffer Allowed

public unsortedList2(Node root){
	
	Node first = root;
	Node runner;
	while(root != null){
		runner = first;
		while(runner != null){
				if(runner.next.val==root.val){
					runner.next = runner.next.next;
				}else{
					runner=runner.next;
				}
		}
		first=root.next;
	}
}