/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class CaracteristicasFisicasS extends SateliteNatural{
    private String masa;
    private double volumen;
    private double densidad;
    private double diametro;
    private double gravedad;

    public CaracteristicasFisicasS(String masa, double volumen, double densidad, double diametro, double gravedad) {
        this.masa = masa;
        this.volumen = volumen;
        this.densidad = densidad;
        this.diametro = diametro;
        this.gravedad = gravedad;
    }
    public String toString(){
        return "Caracteristicas Fisicas:\n Masa: "+masa+"kg\n Volumen: "+volumen+"km^3\n Densidad: "+densidad+"g/cm^3\n Diametro: "+diametro+"km\n Gravedad: "+gravedad+"m/s^2";
    }
}
