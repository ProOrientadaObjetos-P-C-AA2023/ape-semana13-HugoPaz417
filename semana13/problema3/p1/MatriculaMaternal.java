package problema3.p1;

public class MatriculaMaternal implements Matricula {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        tarifa = 50.2 + 40.2 + 80.2;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
}

