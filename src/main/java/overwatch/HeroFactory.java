package overwatch;

public class HeroFactory {
    public static Hero create(Hero.Role role) {
        return switch (role) {
            case TANK -> new Tank();
            case SUPPORT -> new Support();
            case DAMAGE -> new Damage();
            default -> throw new IllegalArgumentException("Unknown role: " + role);
        };
    }
}
