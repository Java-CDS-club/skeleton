package com.company;

public class StringList {
    public String head;
    public StringList tail;
    public StringList(String h, StringList t){
        head=h;
        tail=t;
    }

   public static void main(String[] args){
        StringList L = new StringList("eat", null);
        L = new StringList("you", L);
        L = new StringList("sometimes", L);
        StringList M = L.tail;
        StringList R = new StringList("many", null);
        R = new StringList("potatoes", R);
        R.tail.tail=R;
        L.tail.tail=L.tail.tail.tail;
        L = M.tail;
   }

}
