package com.company;
// Generic ALists(similar to generic SLists)
public class AList<Glorp>{
  private Glorp[] items;
  private int size;
  public AList(){
      items=(Glorp[]) new Object[8];
      size=0;
  }
  public void resize(int cap){
      Glorp[] a = (Glorp[]) new Object[cap];
      System.arraycopy(items,0,a,0,size);
      items=a;
  }
    int RFACTOR=3;
    public void insertBack(Glorp x){
        if (size==items.length){
            resize(size*RFACTOR);
        }
        items[size]=x;
        size+=1;
    }
    public void addLast(Glorp x){
        items[size]=x;
        size+=1;
    }

    public static void main(String[] args){
        AList a =new<Integer> AList();
        a.addLast(3);
        a.addLast(2);
        a.addLast(1);
        a.insertBack(5);
    }
}




/**
public class AList {
    private int[] items;
    private int size;
    public AList(){
        items=new int[100];
        size=0;
    }
    public void addLast(int x){
        items[size]=x;
        size+=1;
    }
    public int getLast(){
        return items[size-1];
    }
    //The first item is i=0
    public int get(int i){
        return items[i];
    }
    public int size(){
        return size;
    }
    //remove the last item and return the item removed
    public int removeLast(){
        int returnItem=items[size-1];
        items[size-1]=0;
        size-=1;
        return returnItem;
    }
    //Resize and add back
    private void resize(int capacity){
        int[] a = new int[capacity];
        System.arraycopy(items,0,a,0,size);
        items=a;
    }
    int RFACTOR=3;
    public void insertBack(int x){
        if (size==items.length){
            resize(size*RFACTOR);
        }
        items[size]=x;
        size+=1;
    }

    public static void main(String[] args){
        AList a =new AList();
        a.addLast(3);
        a.addLast(2);
        a.addLast(1);
        System.out.println(a.getLast());
        System.out.println(a.get(1));
        System.out.println(a.size());
        a.removeLast();
    }
}
 */
