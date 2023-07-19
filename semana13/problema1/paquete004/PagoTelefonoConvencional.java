package problema1.paquete004;

public class PagoTelefonoConvencional extends Pago {
    private double minutosConsumidos;
    private double costoMinuto;
    public PagoTelefonoConvencional(double minutosConsumidos, double costoMinuto) {
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    @Override
    public void calcularPago() {
        pago = minutosConsumidos * costoMinuto;
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" +
                "minutosConsumidos=" + minutosConsumidos +
                ", costoMinuto=" + costoMinuto +
                ", pago=" + pago +
                '}';
    }
}