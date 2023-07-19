package problema1.paquete003;

import problema1.paquete001.Persona;
import problema1.paquete004.*;

import java.util.List;

public class BilleteraPagos {
    private Persona persona;
    private double gastoPagos;
    private String mes;
    private List<Pago> pagos;

    public BilleteraPagos(Persona persona, String mes, List<Pago> pagos) {
        this.persona = persona;
        this.mes = mes;
        this.pagos = pagos;
    }

    public void calcularGastoPagos() {
        for (Pago pago : pagos) {
            pago.calcularPago();
            gastoPagos += pago.getPago();
        }
    }

    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "persona=" + persona +
                ", gastoPagos=" + gastoPagos +
                ", mes='" + mes + '\'' +
                ", pagos=" + pagos +
                '}';
    }

    public double getGastoPagos() {
        return gastoPagos;
    }

    public void setGastoPagos(double gastoPagos) {
        this.gastoPagos = gastoPagos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
}
