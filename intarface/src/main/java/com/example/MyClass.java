package com.example;

interface rishu{
    void print();
}

class Abhi implements rishu{
    public void print(){System.out.println("abhishek is abhishek");}

    public static void main(String args[]){
        Abhi a = new Abhi();
        a.print();
    }
}