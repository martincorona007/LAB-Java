/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class CaracteristicasAtmosfericas extends Planetas {

    private String composicionAtmosferica;
    private int Maxima;
    private int Minima;
    private int Media;
    private double ts;
    private double ti;
    public CaracteristicasAtmosfericas(){

    }
    public CaracteristicasAtmosfericas(String composicionAtmosferica, int maxima, int minima, int media) {

        this.composicionAtmosferica = composicionAtmosferica;
        this.Maxima = maxima;
        this.Minima = minima;
        this.Media = media;

    }
    public void sol(String composicionAtmosferica,double TemperaturaSuperficial,double TemperaturaInterior){
        this.composicionAtmosferica=composicionAtmosferica;
        this.ts=TemperaturaSuperficial;
        this.ti=TemperaturaInterior;
    }
    public void imprime(){
        System.out.println("Caracteristicas Atmosfericas\n Composicion Atmosferica: "+composicionAtmosferica+"\n Temperatura Superficial: "+ts+"°C\n Temperatura Interior: "+ti+" millones°C");
    }
    public String toString(){
        return "Caracteristicas Atmosfericas\n Composicion Atmosferica: "+composicionAtmosferica+"\n Temperatura: \n Maxima: "+Maxima+"°\n Minima: "+Minima+"°\n Media: "+Media+"°";
    }
}
