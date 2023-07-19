package problema3.p3;

import problema3.p1.*;
import problema3.p2.TipoMatricula;

public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        tipos.establecerMatriculaCampamento(mcamp);
        tipos.establecerMatriculaColegio(mcolegio);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de tarifas: %.2f\n", tipos.obtenerPromedioTarifas());
    }
}
