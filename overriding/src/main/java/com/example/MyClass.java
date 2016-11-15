package com.example;
class Bank{
    int getRateOfInterest(){return 0;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}


class UCO extends Bank{
    int getRateOfInterest(){return 90;}
}

class Test2{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        UCO a1=new UCO();
        PNB uu=new PNB();

        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
        System.out.println("UCO Rate of Interest: "+a1.getRateOfInterest());
        System.out.println("PNB Rate of Interest: "+uu.getRateOfInterest());

    }
}