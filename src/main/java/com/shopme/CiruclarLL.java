package com.shopme;

public class CiruclarLL {
    Node head;
    Node tail;
    public CiruclarLL()
    {
        this.head=null;
        this.tail=null;
    }
    public void insert(int val)
    {
        Node node= new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display()
    {
        Node temp=head;
//        Node last=tail;
//        while(temp!=last)
//        {
//            System.out.print(temp.val);
//            temp=temp.next;
//        }
//        System.out.println(last.val);
        do{
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("End");

    }
    public class Node
    {
        int val;
        Node next;
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val, Node next)
        {
            this.val=val;
            this.next= next;
        }
    }
}
