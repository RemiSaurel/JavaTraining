package overwatch;

public abstract class Hero {
    public Role role;

    public Hero(Role role) {
        this.role = role;
    }

    public abstract void ultimate();

    public void walk() {
        System.out.println("Walking...");
    }

    public void jump() {
        System.out.println("Jumping...");
    }

    public enum Role {
        TANK,
        DAMAGE,
        SUPPORT
    }
}
