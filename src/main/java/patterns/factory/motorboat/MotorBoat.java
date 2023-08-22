package patterns.factory.motorboat;

import patterns.factory.Boat;

public class MotorBoat implements Boat {
    private int speed;
    private static final int NOTCH = 20;

    @Override
    public void forward() {
        System.out.println("Motor boat is moving forward");
    }

    @Override
    public void backward() {
        System.out.println("Motor boat is moving backward");
    }

    @Override
    public void left() {
        System.out.println("Motor boat is moving left");
    }

    @Override
    public void right() {
        System.out.println("Motor boat is moving right");
    }

    @Override
    public void stop() {
        System.out.println("Motor boat is stopped");
    }

    @Override
    public void start() {
        System.out.println("Motor boat is started");
    }

    @Override
    public void increaseSpeed() {
        speed += NOTCH;
    }

    @Override
    public void decreaseSpeed() {
        speed -= NOTCH;
    }

    @Override
    public void print() {
        System.out.println("Motor boat speed is " + speed);
    }
}
