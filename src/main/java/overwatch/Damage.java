package overwatch;

public class Damage extends Hero {
    public Damage() {
        super(Role.DAMAGE);
    }

    public void shoot() {
        System.out.println("Shooting...");
    }

    @Override
    public void ultimate() {
        System.out.println("Damage ultimate!");
    }
}
