package com.company;

public class AList <Item> implements List61B<Item>{
    @Override
    private Glorp[] items;
    private int size;

    public AList (){
        items= (Glorp []) new Object[5];
        size=0;
    }
    // The position of the next item to be inserted is always size
    // Size is always the number of items in the AList
    // The last item in the list is always in position size-1

    public Glorp getLast(){
        return items[size-1];
    }
    public Glorp get(int i){
        return items[i];
    }

    public int size(){
        return size;
    }
    public Glorp removeLast(){
        Glorp returnItem = items[size-1];
        items[size-1]=null;
        size-=1;
        return returnItem;
    }

    // Array Resizing, when the array gets too full, addLast(11), jsut make a new array
    public void addLast(Glorp x){
        if (size==items.length){
            Glorp[] a=(Glorp []) new Object[size+1];
            System.arraycopy(items,0,a,0,size);
            items=a;
        }
        items[size]=x;
        size+=1;
    }

    public void resize(int capacity){
        Glorp[] a=(Glorp []) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items=a;
    }

    public void insertBack(Glorp x){
        if (size==items.length){
            resize(size*10);
        }
        items[size]=x;
        size+=1;
    }

    public static void main(String[] args){
        AList a1=new AList();
        int i=0;
        a1.insertBack("a");
        a1.insertBack("b");
        System.out.println("done");
    }
}
