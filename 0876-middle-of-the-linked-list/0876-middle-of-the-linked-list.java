class Solution {
public ListNode middleNode(ListNode head) {
ListNode temp=head;
    int c=0;
    while(temp!=null)
    {
        c++;
        temp=temp.next;
    }
    if(c%2!=0)
    {
        for(int i=0;i<(c/2);i++)
        {
            head=head.next;
        }
    }else{
          for(int i=0;i<((c+1)/2);i++)
        {
            head=head.next;
        }
    }
    return head;
}
}