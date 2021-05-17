package edu.pingpong.fastbreaktruck.domain.item;

import lombok.Data;

@Data
public class Eyeholes implements Item {

    private final String name = "Eyeholes";
    private final double price = 1.0007;


    @Override
    public String itemName() {
        return this.name;
    }

    @Override
    public double itemPrice() {
        return this.price;
    }
}
