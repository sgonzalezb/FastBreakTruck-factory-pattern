package edu.pingpong.fastbreaktruck.factory;

import edu.pingpong.fastbreaktruck.domain.drink.Drink;
import edu.pingpong.fastbreaktruck.domain.drink.FleebJuice;
import edu.pingpong.fastbreaktruck.domain.drink.TurbulentJuice;

public class FactoryDrink {

    public Drink getDrink(String name){

        if (name == null) {
            return null;
        }

        if(name == "FleebJuice") {
            return new FleebJuice();
        }else if(name == "TurbulentJuice"){
            return new TurbulentJuice();}

        return null;
        
    }
}
