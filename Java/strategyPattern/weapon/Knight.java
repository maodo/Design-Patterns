package strategyPattern.weapon;

public class Knight extends Character{

    @Override
    void fight() {
        getWeaponBehavior().useWeapon();
    }
}
