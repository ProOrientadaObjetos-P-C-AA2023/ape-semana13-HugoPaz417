package problema3.p1;

public class MatriculaJardin implements Matricula {
    private double tarifa;

    @Override
    public void establecerTarifa(){
        tarifa = 50.2 + 140.2 + 40;
    }

    @Override
    public double obtenerTarifa(){
        return tarifa;
    }
}

