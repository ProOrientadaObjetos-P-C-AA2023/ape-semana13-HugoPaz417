package problema1.paquete004;

import problema1.paquete002.Ciudad;

public class PagoLuzElectrica extends Pago {
    private Ciudad ciudad;
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;

    public PagoLuzElectrica(Ciudad ciudad, double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        this.ciudad = ciudad;
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    @Override
    public void calcularPago() {
        if (ciudad.getNombreCiudad().equals("LOJA")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" +
                "ciudad=" + ciudad +
                ", tarifaBase=" + tarifaBase +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio +
                ", pago=" + pago +
                '}';
    }
}
