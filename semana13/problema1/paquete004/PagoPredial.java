package problema1.paquete004;

public class PagoPredial extends Pago {
    private double valorPropiedad;
    private double porcentaje;

    public PagoPredial(double valorPropiedad, double porcentaje) {
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularPago() {
        pago= valorPropiedad * porcentaje / 100;
    }
    @Override
    public String toString() {
        return "PagoPredial{" +
                "valorPropiedad=" + valorPropiedad +
                ", porcentaje=" + porcentaje +
                ", pago=" + pago +
                '}';
    }
}

