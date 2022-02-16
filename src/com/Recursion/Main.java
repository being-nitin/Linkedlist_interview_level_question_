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
        list.display();
        list.insertRec(88,3);
        list.display();
    }
}
