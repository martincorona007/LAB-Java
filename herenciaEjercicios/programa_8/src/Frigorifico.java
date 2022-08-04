/**
 * Created by Martincorona007 on 24/04/2017.
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion{

    double temperatura;

    public Frigorifico(double c, String m, double t) {
        super(c, m);
        this.temperatura=t;
    }

    public String toString() {
        return Frigorifico.super.toString();
    }

    public String muestra() {
        return "La temperatura es: "+temperatura+"°";
    }
}
