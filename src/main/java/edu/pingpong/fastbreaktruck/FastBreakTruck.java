package edu.pingpong.fastbreaktruck;

import edu.pingpong.fastbreaktruck.domain.drink.Drink;
import edu.pingpong.fastbreaktruck.domain.item.Item;
import edu.pingpong.fastbreaktruck.domain.packing.Packing;
import edu.pingpong.fastbreaktruck.factory.FactoryDrink;
import edu.pingpong.fastbreaktruck.factory.FactoryItem;
import edu.pingpong.fastbreaktruck.factory.FactoryPack;

public class FastBreakTruck
{
    public static void main( String[] args )
    {
        /*Primer desayuno del día*/

        /*Bebida*/
        FactoryDrink createdDrink = new FactoryDrink();
        Drink drink = createdDrink.getDrink("TurbulentJuice");

        /*Pack*/
        FactoryPack factoryPack = new FactoryPack();
        Packing packing = factoryPack.getPack("Tubo");

        /*Item*/
        FactoryItem factoryItem = new FactoryItem();
        Item item = factoryItem.getItem("Smiggles");

        /*Precio total*/
        double totalPrice = drink.price() + item.itemPrice();




        System.out.println("\nSmiggles!!!!\n" +
                "Desayuno Smiggles"
                +"\n"+"-----------------"+"\n"
                +"Cereales: "+ item.itemName()+" Precio: " + item.itemPrice()+"\n"
                +"Bebida: "+ drink.name()+ " Precio: " + drink.price()+"\n"
                +"Pack: "+ packing.shapePack()+"\n"
                +"Coste total:            "+ totalPrice+ " Bitcoins"
        );

        /*Segundo desayuno del día*/

        /*Bebida*/
        FactoryDrink createdDrink2 = new FactoryDrink();
        Drink drink2= createdDrink2.getDrink("FleebJuice");

        /*Pack*/
        FactoryPack factoryPack2 = new FactoryPack();
        Packing packing2 = factoryPack2.getPack("Caja");

        /*Item*/
        FactoryItem factoryItem2 = new FactoryItem();
        Item item2 = factoryItem2.getItem("Eyeholes");

        /*Precio total*/
        double totalPrice2 = drink2.price() + item2.itemPrice();




        System.out.println("\nEyeholes!!!!\n" +
                "Desayuno Eyeholes"
                +"\n"+"-----------------"+"\n"
                +"Cereales: "+ item2.itemName()+" Precio: " + item2.itemPrice()+"\n"
                +"Bebida: "+ drink2.name()+ " Precio: " + drink2.price()+"\n"
                +"Pack: "+ packing2.shapePack()+"\n"
                +"Coste total:            "+ totalPrice2+ " Bitcoins"
        );
    }
}
