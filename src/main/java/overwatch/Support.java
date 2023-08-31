package overwatch;

public class Support extends Hero {
    public Support() {
        super(Role.SUPPORT);
    }

    public void heal() {
        System.out.println("Healing...");
    }

    @Override
    public void ultimate() {
        System.out.println("Support ultimate!");
    }
}
