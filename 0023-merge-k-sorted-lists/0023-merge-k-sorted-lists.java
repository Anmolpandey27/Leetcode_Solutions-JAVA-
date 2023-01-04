class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<=0){
            return null;
        }
		
        ArrayList<Integer> arr = new ArrayList<>();
		
        for(int i = 0;i<lists.length;i++){
            while(lists[i]!=null){
                arr.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
		
		//sorting the ArrayList
        Collections.sort(arr); 
		
        ListNode head = null;
        ListNode tail = null;
		//creating a new LinkedList using data from the ArrayList
        for(int i = 0;i<arr.size();i++){
            ListNode node = new ListNode(arr.get(i));
            if(head==null){
                head = node;
                tail = node;
            }else{
                tail.next = node;
                tail = tail.next;
            }
        }
		
        return head;
    }
}