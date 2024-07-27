package com.shopme;



public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL()
    {
        this.size=size;
    }
    public void insertFirst(int val)
    {
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
            tail=head;
        size++;
    }
    public void insertLast(int val)
    {
        Node node= new Node(val);
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index)
    {
        if(index>size+1)
            throw new IndexOutOfBoundsException("Index is greater than list's size:"+size);
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;


    }
    public void insertRecursion(int val,int index)
    {
        head=insertRec(val,index,head);
    }
    public Node insertRec(int val, int index,Node node)
    {
        if(index==0)
        {
            Node temp= new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    //Remove Duplicates from sorted LL
    public void duplicate()
    {
        Node temp= head;
        while(temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
                size--;
            }
            else {
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }
    //merge two sorted LL
    public LL merge(LL first,LL second)
    {
        Node f=first.head;
        Node s= second.head;
        LL ans= new LL();
        while(f!=null && s!=null)
        {
            if(f.value<s.value)
            {
                ans.insertLast(f.value);
                f=f.next;
            }
            else {
                ans.insertLast(s.value);
                s=s.next;

            }
        }
        while(f!=null)
        {
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null)
        {
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;

    }
    public void deleteFirst()
    {
        int val=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return;
    }
    public void deleteLast()
    {
        if(size<=1)
        {
            deleteFirst();
            return;
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return;
    }
    public Node get(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void delete(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return;
        }
        if(index==size)
        {
            deleteLast();
            return;
        }
        Node prev=get(index-1);
        Node nextNext=prev.next.next;
        prev.next=nextNext;
        return;
    }

    public void display()
    {
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
}
