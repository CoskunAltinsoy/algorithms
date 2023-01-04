
public class Main {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
		ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));
		
	    ListNode temp = new ListNode();
	    ListNode head = temp;
	       
	    while(list1 != null && list2 != null){
	    	if(list1.val<list2.val){
	    		temp.next = list1;
	            list1 = list1.next;
	        }
	    	else{
	    		temp.next = list2;
	            list2 = list2.next;
	        }
	    	
	    	temp = temp.next;
	    }
	    
	    if(list1 != null){
	    	temp.next = list1;
	    }
	    
	    else{
	    	temp.next = list2;
	    }
	    
	     System.out.println(head.next);
	
	}

//	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//	 
//	    }

	 public static class ListNode {
		 int val;
		 ListNode next;
		 
		 ListNode() {
			 
		 }
		 
		 ListNode(int val) {
			 this.val = val; 
		 }
		 
		 ListNode(int val, ListNode next) { 
			 this.val = val; this.next = next; 
	     }
		 }
}
