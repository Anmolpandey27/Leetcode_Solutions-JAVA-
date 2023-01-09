class MyLinkedList {
    Node start=null;
    public MyLinkedList() {
    }
    
    public int get(int i) {
        int c=0;
        for(Node ptr=start;ptr!=null;ptr=ptr.next)
        {
            if(i==c)
                return ptr.data;
            c++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node fresh=new Node();
        fresh.data=val;
        fresh.next=start;
        start=fresh;
    }
    
    public void addAtTail(int val) {
        if(start==null)
        {
            Node fresh=new Node();
            fresh.data=val;
            start=fresh;
        }
        else
        {
            Node ptr;
            for(ptr=start;ptr.next!=null;ptr=ptr.next);
            Node fresh=new Node();
            fresh.data=val;
            ptr.next=fresh;
        }
    }
    
    public void addAtIndex(int i, int val) {
        int c=count(start);
        if(i==0)
        {
            addAtHead(val);
        }
        else if(i==c)
        {
            addAtTail(val);
        }
        else
        {
            int j=0;
            for(Node ptr=start;ptr!=null;ptr=ptr.next,j++)
            {
                if(j==i-1)
                {
                    Node fresh=new Node();
                    fresh.data=val;
                    fresh.next=ptr.next;
                    ptr.next=fresh;
                    break;
                }
            }
        }
    }
    
    public void deleteAtIndex(int i) {
        if(i==0)
        {
            start=start.next;
        }
        int c=count(start);
        if(i>0&&i<c)
        {
            int j=0;
            for(Node ptr=start;ptr!=null;ptr=ptr.next,j++)
            {
                if(j==i-1)
                {
                    ptr.next=ptr.next.next;
                    break;
                }
            }
        }       
    }
    public int count(Node head)
    {
        int c=0;
        for(Node ptr=head;ptr!=null;ptr=ptr.next)
        {
            c++;
        }
        return c;
    }
}
class Node
{
    Node next;
    int data;
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */