package com.company;

public class SList {
    private static class SNode{
        public int item;
        public SNode next;
        //constructor name should be the same as the class name
        public  SNode(int item, SNode next){
            this.item=item;
            this.next=next;
        }
    }
    private SNode front;
    public void insertFront(int x){
        front=new SNode(x, front);
    }

    //1.1 insert new element at the given position, how to check it in main
    public void insert(int item, int position){
        //consider the base situation first
        if(front==null || position==0){
            insertFront(item);
            return;
        }
            SNode newFront=front;
            while(position>1 && newFront.next!=null){
                position--;
                newFront=newFront.next;
            }
            SNode newNode=new SNode(item, newFront.next);
        newFront.next=newNode;
    }

    public  static void main(String[] args){
        SNode front=new SNode(1,null);
        front = new SNode(2, front);
        front = new SNode(3, front);
        front = new SNode(4, front);
        front = new SNode(5, front);
        //insert(6,2);
    }

    //1.2 Add another method to the SList class that reverse the elements. Do this using the existing SNodes
    public void reverse(){

    }


}
