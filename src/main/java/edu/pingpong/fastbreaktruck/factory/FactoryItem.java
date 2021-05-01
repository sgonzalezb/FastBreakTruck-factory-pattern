package edu.pingpong.fastbreaktruck.factory;

import edu.pingpong.fastbreaktruck.domain.drink.Drink;
import edu.pingpong.fastbreaktruck.domain.drink.FleebJuice;
import edu.pingpong.fastbreaktruck.domain.drink.TurbulentJuice;
import edu.pingpong.fastbreaktruck.domain.item.Eyeholes;
import edu.pingpong.fastbreaktruck.domain.item.Item;
import edu.pingpong.fastbreaktruck.domain.item.Smiggles;

public class FactoryItem {

    public Item getItem(String name){

        if (name == null) {
            return null;
        }

        if(name == "Eyeholes") {
            return new Eyeholes();
        }else if(name == "Smiggles"){
            return new Smiggles();}

        return null;

    }
}
