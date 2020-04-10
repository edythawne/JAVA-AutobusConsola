package AutobusConsola.view;

import AutobusConsola.model.BoletoModel;
import AutobusConsola.model.BusModel;
import AutobusConsola.utils.AsciiFormat;

import java.util.ArrayList;
import java.util.Collection;

public class ViewBus {

    private final Collection<String> s1 = new ArrayList<>();
    private final Collection<String> s2 = new ArrayList<>();
    private final Collection<String> s3 = new ArrayList<>();
    private final Collection<String> s4 = new ArrayList<>();
    // Variables
    private int c1 = 1;
    private int c2 = 2;
    private int c3 = 3;
    private int c4 = 4;

    /**
     * Muestra el autobus
     *
     * @param a
     */
    public void verBusCreado(int a) {
        for (int i = 1; i <= a; i++) {
            if (this.c1 == i) {
                this.s1.add("# " + i);
                this.c1 = c1 + 4;
            } else if (this.c2 == i) {
                this.s2.add("# " + i);
                this.c2 = c2 + 4;
            } else if (this.c3 == i) {
                this.s3.add("# " + i);
                this.c3 = c3 + 4;
            } else if (this.c4 == i) {
                this.s4.add("# " + i);
                this.c4 = c4 + 4;
            }
        }

        AsciiFormat.init();
        AsciiFormat.createRow(s1);
        AsciiFormat.createRow(s2);
        AsciiFormat.createLineBorder();
        AsciiFormat.createRow(s3);
        AsciiFormat.createRow(s4);
        AsciiFormat.createLineBorder();
        AsciiFormat.createTable(null);

        clear();
    }

    /**
     * Mostrar asientos ocupados
     *
     * @param b
     */
    public void verAsientos(BusModel b) {
        for (int n = 0; n < b.getAsientos(); n++) {
            int i = n + 1;
            if (this.c1 == i) {
                if (b.getBoletoList()[n] == null) {
                    this.s1.add("# " + i);
                } else {
                    this.s1.add("Ocu " + i);
                }
                this.c1 = c1 + 4;
            } else if (this.c2 == i) {
                if (b.getBoletoList()[n] == null) {
                    this.s2.add("# " + i);
                } else {
                    this.s2.add("Ocu " + i);
                }
                this.c2 = c2 + 4;
            } else if (this.c3 == i) {
                if (b.getBoletoList()[n] == null) {
                    this.s3.add("# " + i);
                } else {
                    this.s3.add("Ocu " + i);
                }
                this.c3 = c3 + 4;
            } else if (this.c4 == i) {
                if (b.getBoletoList()[n] == null) {
                    this.s4.add("# " + i);
                } else {
                    this.s4.add("Ocu " + i);
                }
                this.c4 = c4 + 4;
            }
        }

        AsciiFormat.init();
        AsciiFormat.createRow(s1);
        AsciiFormat.createRow(s2);
        AsciiFormat.createLineBorder();
        AsciiFormat.createRow(s3);
        AsciiFormat.createRow(s4);
        AsciiFormat.createLineBorder();
        AsciiFormat.createTable(null);

        clear();
    }

    /**
     * Mensaje de Bienvenida
     */
    public void welcome() {
        AsciiFormat.init();
        AsciiFormat.createRow("Central de Autobuses JAVA");
        AsciiFormat.createRow("Edy Thawne");
        AsciiFormat.createLineBorder();
        AsciiFormat.createTable(AsciiFormat.STYLE_MINUSBAR_PLUS_EQUALS);
    }

    public void listaPasajeros(BusModel b) {
        AsciiFormat.init();
        AsciiFormat.createRow("Asiento", "Nombre", "Apellido", "Destino", "Origen", "Precio");

        for (int n = 0; n < b.getAsientos(); n++) {
            if (b.getBoletoList()[n] != null) {
                BoletoModel bt = b.getBoletoList()[n];
                AsciiFormat.createRow(n + 1, bt.getPasajero().getNombre(), bt.getPasajero().getApellidos(), b.getOrigen(), b.getDestino(), bt.getPrecio());
            }
        }

        AsciiFormat.createLineBorder();
        AsciiFormat.createTable(AsciiFormat.STYLE_MINUSBAR_PLUS_EQUALS);
    }

    /**
     * Limpiar
     */
    private void clear() {
        c1 = 1;
        c2 = 2;
        c3 = 3;
        c4 = 4;

        s1.clear();
        s2.clear();
        s3.clear();
        s4.clear();
    }
}
