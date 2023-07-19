package problema1.paquete004;

public class PagoAguaPotable extends Pago {
    private String tipo;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    @Override
    public void calcularPago() {
        if (tipo.equals("CASA")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        } else if (tipo.equals("COMERCIAL")) {
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" +
                "tipo='" + tipo + '\'' +
                ", tarifaFija=" + tarifaFija +
                ", metrosCubicosConsumo=" + metrosCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                ", pago=" + pago +
                '}';
    }
}
