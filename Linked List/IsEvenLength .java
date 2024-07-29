class Solution {
    public boolean isLengthEven(Node head) {
        Node temp = head;
        int count = 0;
        if(head == null){
            return true;
        }
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
