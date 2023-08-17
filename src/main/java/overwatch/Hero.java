package overwatch;

public abstract class Hero {
    public enum Role {
        TANK,
        DAMAGE,
        SUPPORT
    }

    public Hero(Role role) {
        this.role = role;
    }

    public Role role;
    public abstract void ultimate();
    public void walk() {
        System.out.println("Walking...");
    }
    public void jump() {
        System.out.println("Jumping...");
    }
}
