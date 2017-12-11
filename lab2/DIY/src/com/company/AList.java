package com.company;

/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private int[] items;
    private int size;

    public AList(int i) {
        items=new int[i];
        size=0;
    }

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {
        //The item to be insertBack is always the location size
        if (size==items.length){
            int[] a=new int [size+1];
            System.arraycopy(items,0,a,0,size);
            items=a;
        }
        items[size] = x;
        size+=1;
    }

    /** Returns the item from the back of the list. */
    public int getBack() {
        //The last position is at index size-1
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int deleteBack() {
        int returnvalue = items[size-1];
        items[size-1]=0;
        size=size-1;
        return returnvalue;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    // why we need to add static in order to be run by main method
    public static void testEmptySize(){
        AList L = new AList(5);
        if (L.size==0)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void testInsertAndSize(){
        AList L =new AList(5);
        L.insertBack(99);
        L.insertBack(99);
        if (L.size==2)
            System.out.println("testInsertAndSize: Equal");
        else
            System.out.println("testInsertAndSize:Not Equal");
    }

    public static void testInsertAndGetBack(){
        AList L = new AList(5);
        L.insertBack(99);
        if (L.getBack()==99)
            System.out.println("testInsertAndGetBack: Equal");
        else
            System.out.println("testInsertAndGetBack: Not Equal");

        L.insertBack(36);
        if (L.getBack()==36)
            System.out.println("testInsertAndGetBack: Equal");
        else
            System.out.println("testInsertAndGetBack: Not Equal");
    }

    public static void testGet() {
        AList L = new AList(5);
        L.insertBack(99);
        if (L.get(0)==99)
            System.out.println("testGet: Equal");
        else
            System.out.println("testGet: Not Equal");
        L.insertBack(36);
        if (L.get(0)==99)
            System.out.println("testGet: Equal");
        else
            System.out.println("testGet: Not Equal");
        if (L.get(1)==36)
            System.out.println("testGet: Equal");
        else
            System.out.println("testGet: Not Equal");

    }

    public static void testDelete() {
        AList L = new AList(5);
        L.insertBack(99);
        L.insertBack(36);
        L.deleteBack();
        if (L.getBack()==99)
            System.out.println("True");
        else
            System.out.println("False");
        L.insertBack(100);
        if (L.getBack()==100)
            System.out.println("True");
        else
            System.out.println("False");
        if (L.size()==2)
            System.out.println("True");
        else
            System.out.println("False");
    }
    // Test insertion of a large number of items
    public static void testMegaInsert() {
        AList L = new AList(5);
        int N = 100;
        for (int i = 0; i < N; i += 1) {
            L.insertBack(i);
        }

        for (int i = 0; i < N; i += 1) {
            if (L.get(i)==i)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

    public static void main(String[] args){
        testEmptySize();
        testInsertAndSize();
        testInsertAndGetBack();
        testGet();
        testMegaInsert();
    }


}
