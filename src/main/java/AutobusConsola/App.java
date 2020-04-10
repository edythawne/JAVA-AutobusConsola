package AutobusConsola;

import AutobusConsola.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    // Gradle Run /gradlew run --console=plain

    public static final BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

    public static String text() {
        try {
            return s.readLine();
        } catch (IOException ex) {
            return "";
        }
    }

    public static int number(int dv) {
        try {
            return Integer.parseInt(s.readLine());
        } catch (IOException ex) {
            return dv;
        }
    }

    public static void main(String[] args) {
        // Objeto para leer en consola

        View view = new View();
        boolean continuar = true;
        boolean primer = true;
        int acciones = 1;

        System.out.print("\n");

        while (continuar) {
            if (primer) {
                System.out.println("Debe crear un autobus");
                System.out.print("Origen del Autobus : ");
                String o = text();
                System.out.print("Destino del Autobus : ");
                String d = text();
                view.crearBus(o, d, 40);
                primer = false;
            }

            System.out.print("Menu de Acciones \n" +
                    "[1] Vender Boleto \n" +
                    "[2] Mostrar Disponibilidad de Autobus \n" +
                    "[3] Mostrar Lista de Pasajeros \n"
            );

            System.out.print("Seleccione una opcion : ");

            acciones = number(2);
            if (acciones > 3) {
                acciones = 2;
            }

            switch (acciones) {
                case 1:
                    System.out.println();
                    System.out.println("VENTA DE BOLETO\nLista de Disponibilidad");
                    view.verAsientosOcupados();

                    System.out.println("Crear Pasajero");
                    System.out.print("Apellido: ");
                    String a = text();
                    System.out.print("Nombre : ");
                    String n = text();

                    view.crearPasajero(n, a);

                    System.out.println("Venta del Boleto");
                    System.out.print("Numero de Asiento: ");
                    int at = 0;

                    try {
                        at = Integer.parseInt(s.readLine());
                    } catch (Exception ex) {
                        System.out.println("Error al ingresar el asiento, intente de nuevo");
                        break;
                    }

                    view.crearBoleto(399.99f, at);
                    break;

                case 2:
                    view.verAsientosOcupados();
                    break;

                case 3:
                    view.verListaPasajeros();
                    break;
            }

            System.out.println();
            System.out.print("Regresar al menu principal [1= SI] [2 = N]: ");
            try {
                String cn = text();
                if (cn.equals("1") || cn.equals("SI") || cn.equals("si") || cn.equals("Si")) {
                    continuar = true;
                    System.out.println("\n\n");
                    view.welcome();
                } else {
                    continuar = false;
                }
            } catch (Exception ex) {
                continuar = true;
            }


        }
    }

}
