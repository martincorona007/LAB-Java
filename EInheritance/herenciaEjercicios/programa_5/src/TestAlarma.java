/**
 * Created by Martincorona007 on 21/04/2017.
 */
public class TestAlarma {
    public static void main(String[] args) {
        Sensor s=new Sensor();
        int x=s.setValorActual(40);
        Alarma a=new Alarma();
        //incovo metodo
        a.comprobar(50);
    }
}
