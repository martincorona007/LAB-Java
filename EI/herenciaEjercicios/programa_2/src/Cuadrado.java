/**
 * Created by Martincorona007 on 07/04/2017.
 */
public class Cuadrado extends Figura {


    public Cuadrado(double lado) {

   area=0;
   area=Math.pow(lado,2);

    }

    @Override
    public float velocidad(float d, float t) {
        return 0;
    }
}

