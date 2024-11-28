import java.util.Vector;

/**
 * Created by Martincorona007 on 07/04/2017.
 */
public class Jerarquia {
    public static void main(String[] args) {
        Vector<Figura> figuras=new Vector<Figura>();
        figuras.add(new Circulo(4));
        figuras.add(new Cuadrado(10));
        figuras.add(new Triangulo(3,6));
        for (Figura f:figuras)
            System.out.println("Area: "+f.area);


    }
}
