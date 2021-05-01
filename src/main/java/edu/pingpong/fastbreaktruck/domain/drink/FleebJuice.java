package edu.pingpong.fastbreaktruck.domain.drink;


import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * Dependencia que permite crear clases mucho más compactas
 * gracias a los decoradores.El decorador @Data genera todos los getters y setters,
 * toString...
 * El decorador @AllArgsConstructor crea un constructor con todos los atributos
 * de la clase (exculyendo los nulos y los final)
 * */
@Data @AllArgsConstructor
public class FleebJuice implements Drink{

    private final String name = "FleebJuice";
    private final double price = 0.3;


    @Override
    public String name() {
        return getName();
    }

    @Override
    public double price() {
        return getPrice();
    }
}
