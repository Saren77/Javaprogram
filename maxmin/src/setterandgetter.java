
package com.company;

import java.util.Scanner;
class A{
    private int x;
    private int y;
    //getter and setter to set the values of x and y. How ?
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class setterandgetter{
    public static void main(String[] args) {
        A obj=new A();
//    obj.x=5;
//    obj.y=10;
        obj.setX(3);   obj.setY(5);

        System.out.println(obj.getX()); System.out.println(obj.getY());
    }
}