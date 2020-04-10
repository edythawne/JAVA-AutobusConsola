package AutobusConsola.model;

public class BusModel {

    private BoletoModel[] boletoList;
    private String origen;
    private String destino;
    private int asientos;

    /**
     * Constructor
     */
    public BusModel() {

    }

    /**
     * Constructor
     *
     * @param a
     */
    public BusModel(String o, String d, int a) {
        this.setOrigen(o);
        this.setDestino(d);
        this.setAsientos(a);
        this.boletoList = new BoletoModel[this.getAsientos()];
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public BoletoModel[] getBoletoList() {
        return boletoList;
    }

    public void asignarBoleto(BoletoModel b, int a) {
        this.boletoList[a] = b;
    }
}
