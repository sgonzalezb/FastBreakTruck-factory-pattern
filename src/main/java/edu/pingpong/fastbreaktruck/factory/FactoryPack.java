package edu.pingpong.fastbreaktruck.factory;

import edu.pingpong.fastbreaktruck.domain.packing.Caja;
import edu.pingpong.fastbreaktruck.domain.packing.Packing;
import edu.pingpong.fastbreaktruck.domain.packing.Tubo;

public class FactoryPack {

    public Packing getPack(String name){

        if (name.equals("Caja")){
            return new Caja();
        }
        if (name.equals("Tubo")){
            return new Tubo();
        }

    return null;
    }
}
