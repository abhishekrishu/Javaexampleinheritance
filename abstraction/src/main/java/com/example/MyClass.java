package com.example;

abstract class Shape{
    abstract void draw();


}

class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle");}
}
class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}
class Triangle extends Shape{
    void draw() {System.out.println("drawing triangle");}
}
class TestAbstraction1{
    public static void main(String args[]){
        Shape s=new Rectangle();
        s.draw();
    }
}
