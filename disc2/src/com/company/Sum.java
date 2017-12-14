package com.company;
//Four different ways to sum the elements in an array
public class Sum {

    public static int forSum(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static int whileSum(int[] a){
        int sum=0;
        int i=0;
        while(i<a.length){
            sum+=a[i];
            i++;
        }
        return sum;
    }

    public static int forSum2(int[] a){
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        return sum;
    }

    public static int altSum(int[] a){
        return altSum(a,0);
    }
    //sum a starting from position k
    public static int altSum(int[] a, int k){
        if(k==a.length){
            return 0;
        } else {
            return a[k]+altSum(a, k+1);
        }
    }

    public static void main(String[] args){
        int[] a ={1,2,3,4};
        System.out.println(forSum(a));
        System.out.println(whileSum(a));
        System.out.println(forSum2(a));
        System.out.println(altSum(a));
    }
}
