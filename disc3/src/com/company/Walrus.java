package com.company;

public class Walrus {
    public int weight;
    public double tusksize;
    //Create a constructor for Walrus
    public Walrus(int w, double ts){
        weight=w;
        tusksize=ts;
    }
    public static void doStuff(Walrus W, int x){
        W.weight=W.weight-100;
        x=x-5;
    }
    public static void main(String[] args){
        Walrus walrus = new Walrus(3500, 10.5);
        int x=9;
        doStuff(walrus,x);
    }
}
