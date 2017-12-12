package com.company;

public class SList {
    public class SNode{
        public int item;
        public SNode next;
        //constructor name should be the same as the class name
        public  SNode(int item, SNode next){
            this.item=item;
            this.next=next;
        }
    }
    private SNode front;

    public  void insertFront(int x){
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

    //1.2 Add another method to the SList class that reverse the elements. Do this using the existing SNodes
    public void reverse(){
        int add=front.item;
        SNode newFront=new SNode(add, null);
        while(front.next!=null){
            front=front.next;
            add=front.item;
            newFront=new SNode(add, newFront);
        }
        front=newFront;
    }

    //Arrays, 2.1 Insert, non-destructively insert items into array x at the given position
    public static int[] insert(int[] x, int item, int position){
        int[] newX=new int[x.length+1];
        position=Math.min(position,(x.length-1));
        System.arraycopy(x,0,newX,0,position);
        newX[position]=item;
        System.arraycopy(x,position, newX, position+1,x.length-position);
        return newX;
    }
    // Because array has a fixed size, so to add an element, you need to create a new array
    //2.2 reverse, write a method that destructively reverses the items in x
    public static void reverse(int[] x){
        for (int i=0; i<=x.length/2; i++){
            int temp=x[i];
            x[i]=x[x.length-i-1];
            x[x.length-i-1]=temp;
        }
    }
//2.3 xify(int[] x) that returns the ith number with x[i] copies,

    public static int[] xify(int[] x){
        int sum=0;
        for(int i=0; i<x.length; i++){
            sum+=x[i];
        }
        int[] newX = new int[sum];
        int pos=0;
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i]; j++){
                newX[pos+j]=x[i];
            }
            pos=pos+x[i];
        }
        return newX;
    }
/*
   public static void main(String[] args){
        int[] x ={1,2,3,4,5};
       int[] y=insert(x,6,2);
       reverse(y);
       int[] newX=xify(y);
   }
*/

    public static void main(String[] args) {
        SList front = new SList();
        for(int i = 0; i < 5; ++i) {
            front.insertFront(i);
        }
        front.insert(6,2);
        front.reverse();
    }

}

