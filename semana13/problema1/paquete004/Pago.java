package problema1.paquete004;

public abstract class Pago {
    protected double pago;

    public abstract void calcularPago();

    public double getPago() {
        return pago;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "pago=" + pago +
                '}';
    }
}
