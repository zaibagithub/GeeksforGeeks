class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	Node temp=head;
	while(temp.next!=null && temp!=null){
	    if(temp.data==temp.next.data){
	        temp.next=temp.next.next;
	    }
	    else{
	        temp=temp.next;
	    }
	}
	return head;
	
	
    }
}
