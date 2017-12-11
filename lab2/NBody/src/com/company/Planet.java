package com.company;
/**
 * The Planet Class and Its Constructor*/
public class Planet {
    double xxPos; //current x position
    double yyPos; // current y position
    double xxVel; //current velocity in x direction;
    double yyVel; // current velocity in y direction;
    double mass; //mass
    String imgFileName; //the name of the image in the images directly that depict the planet;

    /**
     *Your instance varaibles must be named exactly as above. Start by adding in two Planet constructors that can initialize an instance of the Planet class. The signature of the first constructor should be:*/
    public Planet(double xP, double yP, double xV, double yV, double m, String img){
        xxPos=xP;
        yyPos=yP;
        xxVel=xV;
        yyVel=yV;
        mass=m;
        imgFileName=img;
    }
    /**The second should take in a Planet object and intialize an identical Planet object */
    public  Planet (Planet p){
        this.xxPos=p.xxPos;
        this.yyPos=p.yyPos;
        this.xxVel=p.xxVel;
        this.yyVel=p.yyVel;
        this.mass=p.mass;
        this.imgFileName=p.imgFileName;
    }

    public double calcDistance(Planet p){
        double distance=Math.sqrt(Math.pow((this.xxPos-p.xxPos),2)+Math.pow((this.yyPos-p.yyPos),2));
        return distance;
    }

    public double calcForceExertedBy(Planet p){
        double g=6.67e-11;
        double distance=calcDistance(p);
        double f=g*this.mass*p.mass/(distance*distance);
        return f;
    }

    /**
     * The next two methods that you should write are calcForceExertedByX and calcForceExertedByY. Unlike the calcForceExertedBy method, which returns the total force, these two methods describe the force exerted in the X and Y directions, respectively. Once you've finished, you can recompile and run the next unit test. */
    public double calcForceExertedByX(Planet p){
        double distance=calcDistance(p);
        double f=calcForceExertedBy(p);
        double fx=f*(p.xxPos-this.xxPos)/distance;
        return fx;
    }

    public double calcForceExertedByY(Planet p){
        double distance=calcDistance(p);
        double f=calcForceExertedBy(p);
        double fy=f*(p.yyPos-this.yyPos)/distance;
        return fy;
    }
}

