package edu.pingpong.fastbreaktruck.domain.drink;

import lombok.Data;

@Data
public class TurbulentJuice implements Drink {

    public final String name = "TurbulentJuice";
    public final double price = 0.45;

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public double price() {
        return this.price;
    }
}
