package strategyPattern.weapon;

public class Troll extends Character{

    @Override
    void fight() {
        getWeaponBehavior().useWeapon();
    }
}
