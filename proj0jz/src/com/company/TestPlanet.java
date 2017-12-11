package com.company;
//Create two planets and printout the pairwise force between them

public  class TestPlanet {
    public static void checkNum(double cal, double tru, String text){
        if(cal-tru<cal*0.00001){
            System.out.println(text+": pass");
        } else{
            System.out.println(text+": fail");
        }
    }
    public static void main(String[] args){
        Planet p1 = new Planet(0, 0, 1, 1, 5, "p1");
        Planet p2 = new Planet(1, 1, 2, 2, 4, "p2");
        double xf=p1.calcForceExertedByX(p2);
        double yf=p1.calcForceExertedByY(p2);
        double G=6.67e-11;
        double x=G*p1.mass*p2.mass/2/Math.sqrt(2);
        double y=G*p1.mass*p2.mass/2/Math.sqrt(2);
        checkNum(xf,  x, "X");
        checkNum( yf,  y, "Y");
        System.out.println(xf);
        System.out.println(x);
        System.out.println(yf);
        System.out.println(y);

    }


}
