/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class ElementosOrbitales extends Planetas {
    private double excentricidadOrbital;
    private double anomaliaMedia;
    private double inclinacionDelEje;
    private double inclinacionOrbital;

    public ElementosOrbitales(double excentricidadOrbital, double anomaliaMedia, double inclinacionDelEje, double inclinacionOrbital) {

        this.excentricidadOrbital = excentricidadOrbital;
        this.anomaliaMedia = anomaliaMedia;
        this.inclinacionDelEje = inclinacionDelEje;
        this.inclinacionOrbital = inclinacionOrbital;
    }

    public String toString(){
        return "Elementos Orbitales \n Excentricidad Orbital: "+excentricidadOrbital+"\n Anomalia Media: "+anomaliaMedia+"°\n Inclinacion Del Eje: "+inclinacionDelEje+"°\n Inclinacion Orbital: "+inclinacionOrbital+"°";
    }
}
