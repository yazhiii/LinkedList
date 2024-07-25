package com.shopme;

public class Main {
    public static void main(String[] args) {

        LL list1= new LL();
        list1.insertFirst(1);
        list1.insertFirst(0);
        list1.insertLast(2);
        list1.insert(5,0);
        list1.insert(1,1);
        list1.display();
        list1.deleteFirst();
        list1.deleteLast();
        list1.delete(1);
        list1.display();
        DoublyLL list2= new DoublyLL();
        list2.insertAtFirst(1);
        list2.insertAtFirst(0);
        list2.insertAtFirst(-1);
        list2.insertLast(2);
        list2.display();
        list2.insertAfter(0,3);
        list2.display();
        CiruclarLL list= new CiruclarLL();
        list.insert(0);
        list.insert(1);
        list.display();

    }
}