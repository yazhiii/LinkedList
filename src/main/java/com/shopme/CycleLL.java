package com.shopme;

public class CycleLL {
    ListNode head;
    public boolean hasCycle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
    public int lengthOfCycle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                int length=0;
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detect(ListNode head)
    {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }
            if(length==0)
                return null;

            ListNode f= head;
            ListNode s= head;
            while(length>0)
            {
                s=s.next;
                length--;
            }
            while(f!=s)
            {
                f=f.next;
                s=s.next;

             }
            return s;



    }
    //happy number
    public boolean isHappyNumber(int n)
    {
        int slow=n;
        int fast=n;
        do {
            slow=findSquare(n);
            fast=findSquare(findSquare(n));
        }while(slow!=fast);
        if(slow==1)
            return true;
        return false;
    }
    public int findSquare(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int rem= n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;

    }
    //middle of linkedlist
    public ListNode middle(ListNode head)
    {
        ListNode f=head;
        ListNode s= head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    public class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
