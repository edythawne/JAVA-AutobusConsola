package AutobusConsola.presenter;

import AutobusConsola.model.BusModel;
import AutobusConsola.model.PasajeroModel;

public interface AppListener {

    interface View {

        void getBusCreado(BusModel busModel);

        void getPasajeroCreado(PasajeroModel pasajeroModel);

        void getBoletoCreado(Boolean creado);
    }

    interface Presenter {

        void crearBus(String o, String d, int a) throws Exception;

        void crearPasajero(String n, String a) throws Exception;

        void crearBoletoPasajero(BusModel b, PasajeroModel p, float pr, int a) throws Exception;

    }

}
