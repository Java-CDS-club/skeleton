package com.company;

public class IntList {
    //whilesum
    public static int whileSum(int[] a){
        int i=0;
        int sum=0;
        while (i<a.length){
            sum+=a[i];
            i+=1;
        }
        return sum;
    }
    //basic for loop to sum a
    public static int sum(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    //enhanced for loop to sum a
    public static int altSum(int[] a){
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        return sum;
    }

    //recursion to sum a
    public static int altSum2(int[] a){
        return altSum2(a,0);
    }

    //Sum a starting from position k
    private static int altSum2(int[] a, int k){
        if (k==a.length){
            return 0;
        } else {
            return a[k]+altSum2(a,k+1);
        }
    }
    public static int awfulSum(int[] a){
        int sum=0;
        for (int i=0; i<a.length; sum+=a[i], i++){

        }
        return sum;
    }

    //another for loop to sum a
    public static void main(String[] args){
        int [] a = {1,2,3,4,5};
        int sum1=whileSum(a);
        System.out.println("whileSum: "+sum1);
        int sum2=sum(a);
        System.out.println("Sum from for loop: "+sum2);
        int sum3=altSum(a);
        System.out.println("Sum from enhanced for loop: "+sum3);
        int sum4=altSum2(a);
        System.out.println("Sum from recursion: "+sum4);
        int sum5=awfulSum(a);
        System.out.println("Sum from awfulSum: "+sum5);
    }
}
