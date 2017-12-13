package com.company;

public class Test {
    public static double average(double a, double b){
        return (a+b)/2;
    }
    public static void main(String[] args){
        int x=5;
        int y;
        y=x;
        x=2;
        double average=average(x,y);
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);

        int[] a = {1,2,3,4,5};
        int[] b=a;
        b[0]=5;
    }
}
