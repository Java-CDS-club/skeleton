package com.company;

public class IntList {
    public int head;
    public IntList tail;
    public IntList(int h, IntList t){
        head=h;
        tail=t;
    }
    public static IntList SquareDescructive(IntList L){
        IntList pass=L;
        L.head=L.head*L.head;
        while(pass.tail!=null){
            pass=pass.tail;
            pass.head=pass.head*pass.head;
        }
        return L;
    }

    public static IntList SquareNonDescructive(IntList L){
        IntList newList;
        if(L.tail==null){
            newList=new IntList(L.head, null);
        } else {
            newList=new IntList(L.head, null);
            newList.tail=SquareNonDescructive(L.tail);
        }
        return newList;
    }

    public static void main(String[] args){
        IntList L=new IntList(3,null);
        L = new IntList(2,L);
        L = new IntList(1,L);
        IntList s1=SquareDescructive(L);
        IntList s2 = SquareNonDescructive(L);
    }

}
