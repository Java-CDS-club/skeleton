package com.company;

/** Defines a recursive list of integers.
 *  @author Josh Hug
 */

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head=h;
        tail=t;
    }

    /** Retuns the size of this IntList */
    public int size() {
        if (tail==null){
            return 1;
        } else{
            return 1+tail.size();
        }
    }

    /** Returns the size of this IntList. */
    public int iterativeSize() {
        IntList newList=this;
        int size=1;
        while(newList.tail!=null){
            newList=newList.tail;
            size+=1;
        }
        return size;
    }

    /** In class exercise 1:
     * Returns ith item of this IntList. For
     * simplicity, assume the item exists. */
    public int get(int i) {
        IntList newList = this;
        if (i==0){return head;} else{
            newList=newList.tail;
            i=i-1;
        }
        return newList.head;
    }

    /** Returns the Intlist as a string. Automatically called
     * whenever you try to print an IntList. */
    public String toString() {
        IntList newList=this;
        String s=Integer.toString(newList.head);
        while(newList.tail !=null){
            newList=newList.tail;
            s=s+" "+Integer.toString(newList.head);
        }
        return s;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */

    public static IntList addBack(IntList L, int x){
        IntList newL=L;
        while (newL.tail!=null){
            newL=newL.tail;
        }
        newL.tail=new IntList(x, null);
        return L;
    }

    public static IntList incrList(IntList L, int x) {
        IntList newList=new IntList(L.head, null);
        newList.head=newList.head+x;
        IntList track=L;
        while(track.tail!=null){
            track=track.tail;
            int addHead=track.head;
            newList=addBack(newList, addHead+x);

        }
        return newList;
    }

    /** Returns an IntList identical to L, but with
     * each element decremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        L.head=L.head-x;
        IntList track=L;
        while(track.tail!=null){

        //Test your answers by uncommenting. Or use the Visualizer.
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        L.tail.tail = new IntList(9, null);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
        track=track.tail;
        track.head=track.head-x;
    }
        return L;
}

    public static void main(String[] args) {
        System.out.println(L.toString());
        IntList newList=incrList(L, 3);
        IntList dincrList=dincrList(L,1);
        // System.out.println();
        // System.out.println(dincrList(L, 3));

    }
}
