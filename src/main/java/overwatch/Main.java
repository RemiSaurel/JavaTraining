package overwatch;

public class Main {

    public static void main(String[] args) {
        for (Hero.Role role : Hero.Role.values()) {
            Hero hero = HeroFactory.create(role);
            System.out.println("Hero: " + hero.role);
            hero.walk();
            hero.jump();
            hero.ultimate();
            switch (role) {
                case TANK -> ((Tank) hero).shield();
                case SUPPORT -> ((Support) hero).heal();
                case DAMAGE -> ((Damage) hero).shoot();
            }
            System.out.println("--------------------");
        }
    }
}
