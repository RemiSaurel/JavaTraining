package overwatch;

public class Tank extends Hero {
    public Tank() {
        super(Role.TANK);
    }

    public void shield() {
        System.out.println("Shielding...");
    }

    @Override
    public void ultimate() {
        System.out.println("Tank ultimate!");
    }
}
