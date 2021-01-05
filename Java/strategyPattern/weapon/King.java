package strategyPattern.weapon;

public class King extends Character{

    @Override
    void fight() {
        getWeaponBehavior().useWeapon();
    }
}
