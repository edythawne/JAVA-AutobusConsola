package AutobusConsola.presenter;

import AutobusConsola.model.BoletoModel;
import AutobusConsola.model.BusModel;
import AutobusConsola.model.PasajeroModel;

public class AppPresenter implements AppListener.Presenter {

    private AppListener.View view;

    /**
     * Constructor
     */
    public AppPresenter() {

    }

    /**
     * Constructor
     */
    public AppPresenter(AppListener.View v) {
        this.view = v;
    }

    @Override
    public void crearBus(String o, String d, int a) throws Exception {
        if (a > 10) {
            view.getBusCreado(new BusModel(o, d, a));
        } else {
            throw new Exception("Se quiere crear un autobus con menos de 10 asientos");
        }
    }

    @Override
    public void crearPasajero(String n, String a) throws Exception {
        if (!n.isEmpty()) {
            view.getPasajeroCreado(new PasajeroModel(n, a));
        } else {
            throw new Exception("Se quiere crear un pasajero sin nombre");
        }
    }

    @Override
    public void crearBoletoPasajero(BusModel b, PasajeroModel p, float pr, int a) throws Exception {
        if (p != null) {
            if (b.getBoletoList()[a - 1] == null) {
                b.asignarBoleto(new BoletoModel(p, pr, (a - 1)), (a - 1));
                view.getBoletoCreado(true);
            } else {
                view.getBoletoCreado(false);
            }
        } else {
            throw new Exception("Se quiere crear un Boleto sin haber creado a un pasajero");
        }
    }


}
