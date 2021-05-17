package edu.pingpong.fastbreaktruck.factory;
import edu.pingpong.fastbreaktruck.domain.drink.FleebJuice;
import edu.pingpong.fastbreaktruck.domain.item.Eyeholes;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {

    FleebJuice fleebJuice = new FleebJuice();
    Eyeholes eyeholes = new Eyeholes();

    FactoryDrink factoryDrink = new FactoryDrink();
    FactoryItem factoryItem = new FactoryItem();


    @Test
    public void getDrinkTest(){

        assertEquals(fleebJuice, factoryDrink.getDrink("FleebJuice"));

    }

    @Test
    public void getItemTest(){

        assertEquals(eyeholes, factoryItem.getItem("Eyeholes"));

    }


}
