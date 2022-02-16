package com.Recursion;
import java.util.*;

public class insertRec {
    private Node head;
    private Node tail;
    private int size;

    public insertRec(){
        this.size = 0;
    }
    public void insertFirst(int value){

        /*
        now inserting a node in a linkedlist. if we insert it from first place then the head will be the element
        which will be inserted and the node.next will be the element which was head before insertion.
         */

        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size = size+1;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    // recursive insertion in linkedlist.
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int value, int index,Node node){
        if(index==0 || node == null){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next=insertRec(value,index--,node.next);
        return node;
    }
    private class Node{
        // value = value that is given in a node
        // Node = it will point to the next node.

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }


}
