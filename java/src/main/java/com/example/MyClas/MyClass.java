package com.example.MyClas;

 class Animal {

        public Animal() {

            System.out.println("A new animal has been created!");

        }



        public void sleep() {

            System.out.println("An animal sleeps...");

        }



        public void dance() {

            System.out.println("An animal dance...");

        }

    }
    class Bird extends Animal {

        public Bird() {

            super();

            System.out.println("A new bird has been created!");

        }





        public void sleep() {

            System.out.println("A bird sleeps...");

        }





        public void dance() {

            System.out.println("A bird dance...");

        }

    }

    class Cow extends Animal {

        public Cow() {

            super();

            System.out.println("A new cow has been created!");

        }





        public void sleep() {

            System.out.println("A cow sleeps...");

        }





        public void dance() {

            System.out.println("A cow dance...");

        }

    }
   public class MyClass {

        public static void main(String[] args) {

            Animal animal = new Animal();

            Bird bird = new Bird();

            Cow cow = new Cow();



            System.out.println();



            animal.sleep();

            animal.dance();



            bird.sleep();

            bird.dance();



            cow.sleep();

            cow.dance();

        }

    }



