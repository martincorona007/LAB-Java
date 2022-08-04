/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class CaracteristicasFisicas extends Planetas {
    private String masa;
    private double densidad;
    private double diametro;
    private double distanciaMediaAlSol;
    private double gravedadEcuatorial;

    public CaracteristicasFisicas(String masa, double densidad, double diametro, double distanciaMediaAlSol, double gravedadEcuatorial) {

        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.gravedadEcuatorial = gravedadEcuatorial;
    }
    public String toString(){
        return "Caracteristicas Fisicas \n Masa: "+masa+"kg\n Densidad: "+densidad+"g/cm^3\n Diametro: "+diametro+"km\n Distancia Media al Sol: "+distanciaMediaAlSol+"km\n Gravedad Ecuatorial: "+gravedadEcuatorial+"m/s^2";
    }
}

