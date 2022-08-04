/**
 * Created by Martincorona007 on 20/04/2017.
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private int codigoPostal;
    private String pais;

//  constuctor parametrizado
    Direccion(String calle,String ciudad,int codigoPostal,String pais){
        this.calle=calle;
        this.ciudad=ciudad;
        this.codigoPostal=codigoPostal;
        this.pais=pais;
    }

    //imprimo los datos
    void verDatos(){
        System.out.println("La calle es: "+calle);
        System.out.println("La ciudad es: "+ciudad);
        System.out.println("El codigoPostal es: "+codigoPostal);
        System.out.println("El pais es: "+pais);
    }
}
