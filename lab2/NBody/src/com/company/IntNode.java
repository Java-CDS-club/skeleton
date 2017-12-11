package com.company;

public class IntNode {
    int item;
    IntNode next;

    //Create a constructor for IntNode
    public IntNode(int i, IntNode n){
        item=i;
        next=n;
    }

    public static int addItemsIntList(IntNode head){
        if (head==null){
            return 0;
        } else {
            int listsum=head.item;
            int tailsum=addItemsIntList(head.next);
            listsum=listsum+tailsum;
            return listsum;
        }
    }

    public static void printReversed( IntNode head ) {
        if ( head == null ) {
            // Base case:  The list is empty, and there is nothing to print.
            return;
        }
        else {
            // Recursive case:  The list is non-empty.
            printReversed( head.next );  // Print strings from tail, in reverse order.
            System.out.println( head.item );  // Then print string from head node.
        }
    }

    public static void main (String[] args){
        // Create an IntNode object
        IntNode a=new IntNode(5,null);
        a.next=new IntNode(7,null);
        a.next.next=new IntNode(9,null);
        printReversed(a);
       int itemSum=addItemsIntList(a);

        System.out.println("The sum of the items: "+itemSum);

        //print each element in the IntNode
       /** IntNode runner=a;
        while(runner!=null){
            System.out.println(runner.item);
            runner=runner.next;
        } */
        //for loop to print the elements
        int sum=0;
        for (IntNode runner=a; runner !=null; runner=runner.next){
            System.out.println(runner.item);
            sum+=runner.item;
        }
        System.out.println(sum);
    }

}
