package com.company;
class circle {
    circle(int radius){
        System.out.println("Area of circle is "+Math.PI*radius*radius);

    }


}
class cylinder extends circle{

    cylinder(int radius,int height){
        super(6);
        System.out.println("Area of cylinder "+(2*Math.PI*radius*height+2*Math.PI*radius*radius));
    }
}


public class oops_lecture {
    public static void main(String[] args) {
        cylinder obj=new cylinder(2,3);
    }
}
