package com.company;

public class DListNode {
    public int item;
    DListNode next;
    DListNode previous;
    //Create an construct
    public DListNode(int i, DListNode p, DListNode n){
        item=i;
        previous=p;
        next=n;
    }

    public static void main(String[] args){
        DListNode l1=new DListNode(1,null,null);
        l1.next=new DListNode(2,l1,null);
        l1.next.next=new DListNode(3, l1.next, null);
    }
}
