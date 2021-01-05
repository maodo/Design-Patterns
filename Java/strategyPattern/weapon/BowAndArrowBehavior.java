package strategyPattern.weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("This is Bow and Arrow -> ...");
    }
}
