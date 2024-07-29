class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count=0;
        if(head==null){
            return 0;
        }
        Node temp =head;
        while(temp != null){
            temp=temp.next;
            count++;
        }
       // count++;
        return count;
    }
}
