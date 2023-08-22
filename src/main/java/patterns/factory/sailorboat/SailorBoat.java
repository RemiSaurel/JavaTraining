package patterns.factory.sailorboat;

import patterns.factory.Boat;

public class SailorBoat implements Boat {
    private int speed;

    private static final int NOTCH = 10;
    @Override
    public void forward() {
        System.out.println("Sailor boat is moving forward");
    }

    @Override
    public void backward() {
        System.out.println("Sailor boat is moving backward");
    }

    @Override
    public void left() {
        System.out.println("Sailor boat is moving left");
    }

    @Override
    public void right() {
        System.out.println("Sailor boat is moving right");
    }

    @Override
    public void stop() {
        System.out.println("Sailor boat is stopped");
    }

    @Override
    public void start() {
        System.out.println("Sailor boat is started");
    }

    @Override
    public void increaseSpeed() {
        this.speed += NOTCH;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= NOTCH;
    }

    @Override
    public void print() {
        System.out.println("Sailor boat speed is " + this.speed);
    }
}
