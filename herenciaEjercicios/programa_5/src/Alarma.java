/**
 * Created by Martincorona007 on 21/04/2017.
 */
public class Alarma {
    private int umbral = 50;


    public void comprobar(int valor) {
        //comparo si valor es mayou que umbral
        //e llamo a los metodos de timbre
        //y alarma lumnidoda
        if (valor >= umbral) {
            Timbre t = new Timbre();
            t.activar();
            AlarmaLuminosa al = new AlarmaLuminosa();
            al.encenderLaLuz();

        } else {
            Timbre t = new Timbre();
            t.desactivar();
        }


    }
}