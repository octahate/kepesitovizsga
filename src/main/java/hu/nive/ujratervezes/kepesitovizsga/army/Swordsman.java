package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield;

    public Swordsman(boolean hasArmour) {
        super.health = 100;
        super.damage = 10;
        super.hasArmour = hasArmour;
        this.hasShield = true;
    }

    @Override
    public void sufferDamage(int damage){
        if (hasShield){
            hasShield = false;
        } else super.sufferDamage(damage);
    }
}
