/**
 * Created by Martincorona007 on 23/04/2017.
 */
public class TestCoche {
    public static void main(String[] args) {
        PuertaCoche pc=new PuertaCoche();
        //llega humano to take a car
        pc.setEstaBloqueada(false);
        System.out.println(pc);
        pc.abrirPuerta();
        pc.cerrarPuerta();
        pc.bloqueaPuerta();
        pc.setEstaBloqueada(true);
        System.out.println(pc);
        //leave the car
        pc.desbloquearPuerta();
        pc.abrirPuerta();
        pc.cerrarPuerta();
        pc.bloqueaPuerta();
        pc.setEstaBloqueada(true);
        System.out.println(pc);
        pc.activarAlarma();
        pc.alarmaActivada();
        pc.desactivarAlarma();
        pc.desbloquearPuerta();
        pc.setEstaBloqueada(false);
        System.out.println(pc);
        ComponenteCoche cc=new ComponenteCoche("V8, 355Hp, rango 5600rpm, 383Lb-pie,4100 giros del motor,4*4,bluethooh, asientos de lujo, fibra de carbono",2.510,683900.00);
        System.out.println(cc.toString());
    }
}
