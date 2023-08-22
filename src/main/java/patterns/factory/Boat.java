package patterns.factory;

public interface Boat {
    public void forward();

    public void backward();

    public void left();

    public void right();

    public void stop();

    public void start();

    public void increaseSpeed();

    public void decreaseSpeed();

    void print();
}
