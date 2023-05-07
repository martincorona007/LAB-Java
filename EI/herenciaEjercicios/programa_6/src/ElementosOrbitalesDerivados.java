/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class ElementosOrbitalesDerivados extends Planetas {
    private String periodoDeRotacion;
    private String periodoDeTraslacion;
    private int satelites;
    private double radioOrbitalMedio;

    public ElementosOrbitalesDerivados( String periodoDeRotacion, String periodoDeTraslacion, int satelites, double radioOrbitalMedio) {
        this.periodoDeRotacion = periodoDeRotacion;
        this.periodoDeTraslacion = periodoDeTraslacion;
        this.satelites = satelites;
        this.radioOrbitalMedio = radioOrbitalMedio;
    }
    public String toString(){
        return "Elementos Orbitales Derivados\n Periodo de Rotacion: "+periodoDeRotacion+"\n Periodo de Traslacion: "+periodoDeTraslacion+"\n N° De satelites: "+satelites+"\n Radio Orbita Medio: "+radioOrbitalMedio+"km";
    }
}
