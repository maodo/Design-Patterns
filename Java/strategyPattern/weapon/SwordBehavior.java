package strategyPattern.weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("This is Sword....");
    }
}
