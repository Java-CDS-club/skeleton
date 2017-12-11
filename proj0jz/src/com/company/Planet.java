package com.company;

public class Planet {
    //Planet contains the following 6 instances variables for Planet
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;
    //Create Planet constructor
    public Planet(double xP, double yP, double xV, double yV, double m, String img){
        xxPos=xP;
        yyPos=yP;
        xxVel=xV;
        yyVel=yV;
        mass=m;
        imgFileName=img;
    }
    //Create another constructor which take in the Planet object and initialize an identical Planet object(copy)
    //The signature of the second constructor is as below
    public Planet (Planet p){
        this.xxPos=p.xxPos;
        this.yyPos=p.yyPos;
        this.xxVel=p.xxVel;
        this.yyVel=p.yyVel;
        this.mass=p.mass;
        this.imgFileName=p.imgFileName;
    }
    //Force of p on planet in X direction
    public double calcForceExertedByX(Planet p){
        double G=6.67e-11;
        double dx=p.xxPos-this.xxPos;
        double dy=p.yyPos-this.yyPos;
        double r=Math.sqrt(dx*dx+dy*dy);
        double f=G*p.mass*this.mass/(r*r);
        double f1X=dx*f/r;
        return f1X;
    }
    //Force of p on this in Y direction
    public double calcForceExertedByY(Planet p){
        double G=6.67e-11;
        double dx=p.xxPos-this.xxPos;
        double dy=p.yyPos-this.yyPos;
        double r=Math.sqrt(dx*dx+dy*dy);
        double f=G*p.mass*this.mass/(r*r);
        double f1Y=dy*f/r;
        return f1Y;
    }
    // Calculate the net force in X direction from an array of planets. Do not calculate if the planet is self
    public double calcNetForceExertedByX(Planet[] p) {
        int size=p.length;
        double [] f1X = new double [size];
        double Xsum=0;
        for (int i=0; i<size; i++){
            if(this.equals(p[i])){
                f1X[i]=0;
                Xsum+=f1X[i];
            } else {
                f1X[i]=this.calcForceExertedByX(p[i]);
                Xsum+=f1X[i];
            }
        }
        return Xsum;
    }

    // Calculate the net force in Y direction from an array of planets. Do not calculate if the planet is self
    public double calcNetForceExertedByY(Planet[] p) {
        int size=p.length;
        double [] f1Y = new double [size];
        double Ysum=0;
        for (int i=0; i<size; i++){
            if(this.equals(p[i])){
                f1Y[i]=0;
                Ysum+=f1Y[i];
            } else {
                f1Y[i]=this.calcForceExertedByY(p[i]);
                Ysum+=f1Y[i];
            }
        }
        return Ysum;
    }
    //Update the Position and the velocity of the planet in a given time dt
    public void update(double dt, double fX, double fY){
        double ax=fX/this.mass;
        double ay=fY/this.mass;
        xxVel=xxVel+ax*dt;
        yyVel=yyVel+ay*dt;
        xxPos=xxPos+dt*xxVel;
        yyPos=yyPos+dt*yyVel;
    }

}
