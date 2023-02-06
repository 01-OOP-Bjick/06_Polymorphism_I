package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        
        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        // output(queen.doYourJob());
        // output(worker.doYourJob());
        // output(drone.doYourJob());
        output("---------------------");
        // output(queen.fly());
        // output(worker.fly());
        // output(drone.fly());
    }
    // 1. Variante Overloading
    private static void pollObj(Queen bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }
    private static void pollObj(Worker bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }
    private static void pollObj(Drone bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}