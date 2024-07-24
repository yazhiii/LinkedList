package com.shopme;

public class Main {
    public static void main(String[] args) {

        LL list= new LL();
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertLast(2);
        list.insert(5,0);
        list.insert(1,1);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.delete(1);
        list.display();

    }
}