package problema2.paquete03;

import java.util.ArrayList;
import problema2.paquete01.Televisor;

public class VentasTvs {
    private ArrayList<Televisor> televisores;

    public VentasTvs(ArrayList<Televisor> tvs) {
        televisores = tvs;
    }

    public double obtenerPrecioTotal() {
        double precioTotal = 0;
        for (Televisor televisor : televisores) {
            precioTotal += televisor.obtenerPrecio();
        }
        return precioTotal;
    }
}

