/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class ElementosOrbitalesS extends SateliteNatural {

    private double inclinacion;
    private double semiejeMayor;
    private double excentricidad;

    public ElementosOrbitalesS(double inclinacion, double semiejeMayor, double excentricidad) {

        this.inclinacion = inclinacion;
        this.semiejeMayor = semiejeMayor;
        this.excentricidad = excentricidad;
    }

    public String toString(){
        return "Elementos Orbitales:\n Inclinacion: "+inclinacion+"°\n Semi eje Mayor: "+semiejeMayor+"km\n Excentricidad: "+excentricidad;
    }
}
