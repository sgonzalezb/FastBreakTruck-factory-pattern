package edu.pingpong.fastbreaktruck.domain.item;

import lombok.Data;

@Data
public class Smiggles implements Item {

    private final String name = "Smiggles";
    private final double price = 1.2307;


    @Override
    public String itemName() {
        return getName();
    }

    @Override
    public double itemPrice() {
        return getPrice();
    }
}
