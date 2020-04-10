package AutobusConsola.model;

public class BoletoModel {

    private PasajeroModel pasajero;
    private float precio;
    private int asiento;

    /**
     * Constructor
     */
    public BoletoModel() {

    }

    /**
     * Constructor
     *
     * @param p
     * @param pr
     * @param a
     */
    public BoletoModel(PasajeroModel p, float pr, int a) {
        this.setPasajero(p);
        this.setPrecio(pr);
        this.setAsiento(a);
    }

    public PasajeroModel getPasajero() {
        return pasajero;
    }

    public void setPasajero(PasajeroModel pasajero) {
        this.pasajero = pasajero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
}
