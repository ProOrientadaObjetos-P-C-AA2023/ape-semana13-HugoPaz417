package problema3.p1;

public class MatriculaCampamento implements Matricula {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        tarifa = 100.2 + 30.2 + 90.2;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
}

