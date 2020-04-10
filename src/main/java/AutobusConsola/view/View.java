package AutobusConsola.view;

import AutobusConsola.model.BusModel;
import AutobusConsola.model.PasajeroModel;
import AutobusConsola.presenter.AppListener;
import AutobusConsola.presenter.AppPresenter;

public class View implements AppListener.View {

    private final ViewBus viewBus;
    private final AppPresenter presenter;
    private BusModel busModel;
    private PasajeroModel pasajeroModel;

    /**
     * Contructor
     */
    public View() {
        this.viewBus = new ViewBus();
        this.presenter = new AppPresenter(this);

        this.welcome();
    }

    /**
     * Mensaje
     */
    public void welcome() {
        this.viewBus.welcome();
    }

    /**
     * Se creara por primera vez un autobus
     */
    public void crearBus(String o, String d, int a) {
        try {
            presenter.crearBus(o, d, a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Se crea un pasajero
     */
    public void crearPasajero(String n, String a) {
        try {
            presenter.crearPasajero(n, a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Se crea un boleto
     */
    public void crearBoleto(float pr, int a) {
        try {
            presenter.crearBoletoPasajero(busModel, pasajeroModel, pr, a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Muestra los asientos ocupados o llenos
     */
    public void verAsientosOcupados() {
        viewBus.verAsientos(busModel);
    }

    /**
     * Mostrar la lista de pasajeros
     */
    public void verListaPasajeros() {
        viewBus.listaPasajeros(busModel);
    }

    /**
     * Mostrar el bus que se ha creado
     */
    public void verBusCreado() {
        viewBus.verBusCreado(busModel.getAsientos());
    }

    @Override
    public void getBusCreado(BusModel busModel) {
        this.busModel = busModel;
        System.out.println("Se ha creado el Autobus con exito \n");
    }

    @Override
    public void getPasajeroCreado(PasajeroModel pasajeroModel) {
        this.pasajeroModel = pasajeroModel;
        System.out.println("Pasajero " + pasajeroModel.getNombre() + " ha sido creado.");
    }

    @Override
    public void getBoletoCreado(Boolean creado) {
        if (creado) {
            System.out.println("Boleto ha sido vendido");
        } else {
            System.out.println("El asiento esta ocupado intente de nuevo");
        }
    }
}
