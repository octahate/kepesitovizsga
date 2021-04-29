package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int health;
    protected int damage;
    protected boolean hasArmour;

    public int getHitPoints() {
        return health;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if (hasArmour) {
            health -= (damage / 2);
        } else health -= damage;
    }
}
