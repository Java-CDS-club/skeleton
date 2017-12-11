package com.company;

public class IntList {
    public int value;
    public IntList tail;
    // Create a constructor for IntList
    public IntList(int v, IntList t){
        value=v;
        tail=t;
    }
    //Make use of the previous constructor created
    public IntList(int v){
        this(v,null);
    }

    public void insertAfter(int value){
        tail=new IntList(value,tail);
    }

    public static void main(String[] args){
        IntList l1=new IntList(7, new IntList(0, new IntList(6)));
        l1.insertAfter(3);
        IntList l2=l1;
        l2.insertAfter(5);
    }

}
