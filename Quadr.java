package oop2;

public class Quadr extends point {
private point endpoint1; 
private point endpoint2;
private point endpoint3;
private point endpoint4;

    public  void setdata(point endpoint1,point endpoint2,point endpoint3,point endpoint4) {
    	this.endpoints1.setPoint(endpoint1.getX(), endpoint1.getY());
    	this.endpoints2.setPoint(endpoint2.getX(), endpoint2.getY());
    	this.endpoints3.setPoint(endpoint3.getX(), endpoint3.getY());
    	this.endpoints4.setPoint(endpoint4.getX(), endpoint4.getY());
    }
    public double Area() {
    	double a=this.distance(endpoints1, endpoints2);
    	double c=this.distance(endpoints1, endpoints3);
    	double b=this.distance(endpoints2, endpoints3);
    	double d=this.distance(endpoints2, endpoints4);
    	double e=this.distance(endpoints3, endpoints4);
    	
    	double s1=(a+b+c)/2;
    	double area1=Math.sqrt(s1(s1-a)(s1-b)(s1-c));
    	
    	double s2=(d+b+e)/2;
    	double area2=Math.sqrt(s2(s2-d)(s2-b)(s2-e));
    	
    	return area1+area2;
    }



}
