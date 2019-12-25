

public class Solution {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> temp=head;
        
        while(temp.next!=null){
            
            if(temp.data.equals(temp.next.data)){
                temp.next=temp.next.next;
            }
            
            else{
                temp=temp.next;
            }
        }
        
        return head;
    }
}
