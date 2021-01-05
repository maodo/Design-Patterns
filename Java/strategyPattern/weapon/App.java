package strategyPattern.weapon;

public class App {

    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
    }
}
