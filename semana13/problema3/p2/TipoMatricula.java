package problema3.p2;

import problema3.p1.Matricula;

public class TipoMatricula {
    private double promedioMatriculas;
    private Matricula campamento;
    private Matricula colegio;

    public void establecerMatriculaCampamento(Matricula campamento){
        this.campamento = campamento;
    }

    public void establecerMatriculaColegio(Matricula colegio){
        this.colegio = colegio;
    }

    public Matricula obtenerMatriculaCampamento(){
        return campamento;
    }

    public Matricula obtenerMatriculaColegio(){
        return colegio;
    }

    public void establecerPromedioTarifas(){
        promedioMatriculas = (obtenerMatriculaCampamento().obtenerTarifa() +
                obtenerMatriculaColegio().obtenerTarifa())/2;
    }

    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
}
