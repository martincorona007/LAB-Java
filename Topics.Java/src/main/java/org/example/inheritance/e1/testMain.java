package org.example.inheritance.e1;

class Car {
    public void run() {
        System.out.println(" running");
    }
}
class innova extends Car {
    public void run(){
        System.out.println("running fast at 120km");
    }
}
public class testMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.run();
        Car c = new innova();
        c.run();

    }
}