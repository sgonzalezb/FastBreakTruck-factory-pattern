package edu.pingpong.fastbreaktruck.domain.packing;


import lombok.Data;

@Data
public class Tubo implements Packing{

    final String shape = "Tubo";

    @Override
    public String shapePack() {
        return this.shape;
    }
}
