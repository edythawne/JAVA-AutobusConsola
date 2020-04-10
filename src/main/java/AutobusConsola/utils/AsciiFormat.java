package AutobusConsola.utils;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.asciithemes.TA_Grid;
import de.vandermeer.asciithemes.a7.A7_Grids;
import de.vandermeer.asciithemes.u8.U8_Grids;

import java.util.Collection;

public class AsciiFormat {

    // Styles
    public static final TA_Grid STYLE_BORDER_DOUBLE = U8_Grids.borderDouble();
    public static final TA_Grid STYLE_MINUSBAR_PLUS_EQUALS = A7_Grids.minusBarPlusEquals();
    // Objeto de la Tabla
    private static AsciiTable TABLE;

    public static void init() {
        TABLE = new AsciiTable();
    }


    /**
     * Se crea una tabla
     * Con Borde Superior, Derecho e Izquiero
     */
    public static void createRow(Collection<String> rows) {
        TABLE.addRule();
        TABLE.addRow(rows);
    }

    /**
     * Se crea una tabla
     * Con Borde Superior, Derecho e Izquiero
     */
    public static void createRow(Object... columns) {
        TABLE.addRule();
        TABLE.addRow(columns);
    }

    /**
     * Crea un borde
     */
    public static void createLineBorder() {
        TABLE.addRule();
    }

    /**
     * Renderiza la tabla
     */
    public static void createTable(TA_Grid style) {
        TABLE.getContext().setWidth(100);

        if (style != null) {
            TABLE.getContext().setGrid(style);
        }

        System.out.println(TABLE.render());
        TABLE.getRawContent().clear();
    }

}
