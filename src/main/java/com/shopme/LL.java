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
