package PescaruObjetos;

import java.util.ArrayList;

public class Ticket {
    public static void main(String[] args) {

        ArrayList<Producto> ticket = new ArrayList<>();

        Producto huevos = new Producto("Huevos", 8.0, 1.21, 5);
        Producto dildos = new Producto("Monster Cock", 120.0, 2.0, 95);
        Producto pepinos = new Producto("Jamaicanos", 30.0, 1.21, 2);

        ticket.add(huevos);
        ticket.add(dildos);
        ticket.add(pepinos);



    }


}
