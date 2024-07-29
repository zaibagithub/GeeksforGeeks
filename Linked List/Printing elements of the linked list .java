class Solution {
    void display(Node head) {
        Node temp = head;
        if(head == null){
            return ;
        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
