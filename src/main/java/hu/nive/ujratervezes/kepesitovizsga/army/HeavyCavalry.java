package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends Archer{

    private int attackCounter;

    public HeavyCavalry() {
        super.health = 150;
        super.damage = 20;
        super.hasArmour = true;
        attackCounter = 0;
    }

    @Override
    public int doDamage(){
        if (attackCounter == 0){
            attackCounter++;
            return (super.doDamage() * 3);
        } else return super.doDamage();
    }
}
