package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> myArmy = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit){
        myArmy.add(militaryUnit);
    }

    public void damageAll(int damage){
        for (int i = myArmy.size()-1; i >= 0 ; i--) {
            myArmy.get(i).sufferDamage(damage);
            if (myArmy.get(i).getHitPoints() < 25 ){
                myArmy.remove(i);
            }
        }
    }

    public int getArmyDamage(){
        int counter = 0;
        for (MilitaryUnit currentMilitaryUnit : myArmy){
            counter+= currentMilitaryUnit.doDamage();
        }
        return counter;
    }

    public int getArmySize(){
        return myArmy.size();
    }

}
