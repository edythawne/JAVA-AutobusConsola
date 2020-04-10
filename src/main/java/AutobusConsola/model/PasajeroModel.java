package AutobusConsola.model;

public class PasajeroModel {

    private String nombre;
    private String apellidos;

    /**
     * Constructor
     */
    public PasajeroModel() {

    }

    /**
     * Constructor
     *
     * @param n
     * @param a
     */
    public PasajeroModel(String n, String a) {
        this.setNombre(n);
        this.setApellidos(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


}
