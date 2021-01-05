package strategyPattern.weapon;

public abstract class Character {
    WeaponBehavior weaponBehavior;
    abstract void fight();

    protected void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    protected WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }
}
