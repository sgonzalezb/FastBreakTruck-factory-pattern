package edu.pingpong.fastbreaktruck.domain.packing;


import lombok.Data;

@Data
public class Caja implements Packing{

    final String shape = "Caja";

    @Override
    public String shapePack() {
        return this.shape;
    }
}
