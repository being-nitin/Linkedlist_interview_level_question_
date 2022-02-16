package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        insertRec list = new insertRec();
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.insertFirst(11);
        // will display the linkedlist before insertion.
        list.display();
        list.insertRec(88,3);
        // will display the linkedlist after insertion.
        list.display();
    }
}
