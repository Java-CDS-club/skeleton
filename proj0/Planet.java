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
        Planet planet=p;
    }

}
