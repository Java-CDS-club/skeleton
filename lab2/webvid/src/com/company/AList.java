package com.company;

// Array based list
// The next item always goes in the size position

public class AList<item>{
    private item[] items;
    private int size;
    private static int NFACTOR=2;

    /** Create an empty list */
    public AList(){
        size=0;
        items=(item[]) new Object[100];
    }

    // Resize our backing array so that it is of the given capacity
    private void resize(int capacity){
        item[] a =(item[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items=a;
    }
// Insert X into the back of the list
    public void insertBack(item x){
        if(size==items.length){
            resize(size*NFACTOR);
        }
        items[size]=x;
        size=size+1;
    }
    //Return the ith item from the back of the list;
    public item getBack(){
        return items[size-1];
    }
    // get the ith item in the list, 0 is the front
    public item get(int i){
        return items[i];
    }
    // Returns the number of items in the list
    public int size(){
        return size;
    }
    // Deletes item from back of the list and return deleted item
    public item deleteBack(){
        item itemToReturn=items[size-1];
        items[size-1]=null;
        size=size-1;
        return itemToReturn;
    }

    //Test the above

    // why we need to add static in order to be run by main method
    public static void testEmptySize(){
        AList L = new AList();
        if (L.size==0)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void testInsertAndSize(){
        AList L =new AList();
        L.insertBack(99);
        L.insertBack(99);
        if (L.size==2)
            System.out.println("testInsertAndSize: Equal");
        else
            System.out.println("testInsertAndSize:Not Equal");
    }

    public static void testInsertAndGetBack(){
        AList L = new AList();
        L.insertBack(99);

        System.out.println(L.getBack() + ":99");

        L.insertBack(36);
        System.out.println(L.getBack() + ":36");
    }

    public static void testGet() {
        AList L = new AList();
        L.insertBack(99);
        System.out.println(L.get(0) + ":99");
        L.insertBack(36);
        System.out.println(L.get(0) + ":99");
        System.out.println(L.get(1) + ":36");
    }

    public static void testDelete() {
        AList L = new AList();
        L.insertBack(99);
        L.insertBack(36);
        L.deleteBack();
        System.out.println(L.getBack() + ":99");

        L.insertBack(100);
        System.out.println(L.getBack() + ":100");
        System.out.println(L.size() + ":2");
    }
    // Test insertion of a large number of items
    public static void main(String[] args){
        testEmptySize();
        testInsertAndSize();
        testInsertAndGetBack();
        testGet();
        testDelete();
    }

}
