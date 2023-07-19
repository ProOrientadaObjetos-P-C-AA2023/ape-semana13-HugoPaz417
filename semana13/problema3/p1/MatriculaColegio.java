package problema3.p1;

public class MatriculaColegio implements Matricula {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
}

