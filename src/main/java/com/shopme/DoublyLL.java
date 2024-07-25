package com.shopme;

public class DoublyLL {
    Node head;

    public void insertAtFirst(int val)
    {
        Node node= new Node(val);
        if(head==null)
        {
            head=node;
            return;
        }
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
        return;
    }
    public void insertAfter(int after,int val)
    {
        Node node= find(after);
        Node newNode=new Node(val);
        if(node.next!=null)
        {
            node.next.prev=newNode;
        }
        newNode.next=node.next;
        node.next=newNode;
        newNode.prev=node;



    }
    public Node find(int after)
    {
        Node temp= head;
        while(temp!=null)
        {
            if(temp.val==after)
                return temp;
            temp=temp.next;
        }
        return null;
    }
    public void insertLast(int val)
    {
        Node node= new Node(val);
        Node temp=head;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }
    public void display()
    {
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("Priniting in Rev");
        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("END");
    }
    public class Node
    {
        int val;
        Node prev;
        Node next;
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val,Node prev,Node next)
        {
            this.val=val;
            this.prev=null;
            this.next=null;
        }
    }
}
