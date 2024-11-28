/**
 * Created by Martincorona007 on 07/04/2017.
 */
public class Triangulo extends Figura{
    public Triangulo(double base, double altura) {
        area=0;
        area=base*altura/2;

    }

    @Override
    public float velocidad(float d, float t) {
        return 0;
    }
}
