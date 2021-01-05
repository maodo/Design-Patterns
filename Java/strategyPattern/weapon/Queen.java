package strategyPattern.weapon;

public class Queen extends Character{

    @Override
    void fight() {
        getWeaponBehavior().useWeapon();
    }
}
