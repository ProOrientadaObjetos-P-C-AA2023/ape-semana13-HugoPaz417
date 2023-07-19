package problema3.p1;

public class MatriculaEscuela implements Matricula {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
}
