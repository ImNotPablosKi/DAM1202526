package EJ4;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        boolean salir = false;

        ArrayList<Ticket> compra = new ArrayList<>();

        double antesDeImpuestos = 0;
        double totalIva = 0;
        double total = 0;
        double precioArticulo = 0;
        String nombre;
        int unidades = 0;
        double iva = 0;

        while (!salir) {

            do {

                System.out.println("Dime el nombre del producto: ");
                nombre = sc.next();
                sc.nextLine();

                do {

                    System.out.println("Ahora dame el precio de dicho producto: ");

                    try {

                        precioArticulo = Double.parseDouble(sc.nextLine());

                        if (precioArticulo < 0) {

                            System.out.println("El precio NO debe ser negativo... ");

                        } else {

                            correcto = true;

                        }

                    } catch (NumberFormatException e) {

                        System.out.println("Valor Inválido!");

                    }

                } while (!correcto);


            } while (!correcto);

            correcto = false;

            do {

                System.out.println("Cuántas unidades has comprado?: ");

                try {

                    unidades = Integer.parseInt(sc.nextLine());

                    if (unidades < 0) {

                        System.out.println("No puede ser un valor negativo...");

                    } else {

                        do {

                            System.out.println("Cuál es el IVA de ese producto? (i.e 0.21)");

                            try {

                                iva = Double.parseDouble(sc.nextLine());

                                if (iva < 0) {

                                    System.out.println("No debe ser un valor negativo...");

                                } else {

                                    correcto = true;

                                }

                            } catch (NumberFormatException e) {

                                System.out.println("Valor Inválido!");

                            }

                        } while (!correcto);

                    }

                } catch (NumberFormatException e) {

                    System.out.println("Valor Inválido!");

                }

            } while (!correcto);

            correcto = false;

            antesDeImpuestos = unidades * precioArticulo;
            totalIva = unidades * precioArticulo * iva;
            total = unidades * precioArticulo * (1 + iva);

            Ticket producto = new Ticket(nombre, unidades, precioArticulo, iva);
            compra.add(producto);

            do {

                System.out.println("Desea agregar otro producto? (S/N): ");
                String opc = sc.next();

                sc.nextLine();

                if (opc.equalsIgnoreCase("S")) {

                    System.out.println("Continuando. . . ");
                    correcto = true;

                } else if (opc.equalsIgnoreCase("N")) {

                    correcto = true;
                    salir = true;

                } else {

                    System.out.println("Valor Inválido!");

                }

            } while (!correcto);


        }

        System.out.println("==== Su Compra ====");

        for (Ticket producto : compra) {

            System.out.println(producto);

        }

        System.out.println("<><><><><><><><><><>");

        System.out.println("Compra Base: " + antesDeImpuestos);
        System.out.println("IVA total de su compra: " + totalIva);
        System.out.println("Compra final, sujeta a Impuestos: " + total);

        sc.close();

    }
}
