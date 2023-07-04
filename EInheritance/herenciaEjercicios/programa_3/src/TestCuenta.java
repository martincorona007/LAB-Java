/**
 * Created by Martincorona007 on 18/04/2017.
 */
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente Cc = new CuentaCorriente();
        Persona p=new Persona();
        System.out.println(p.toString());
        System.out.println(Cc.toString());
        Cc.retirar(700);
        Cc.actualizarSaldo();
        Cc.verSaldocc();

        Persona p1=new Persona("Juan","Doominges","2459E7R5F");
        System.out.println(p1.toString());
        CuentaAhorro ca=new CuentaAhorro(9493251,8450,p1,0.3,100);
        System.out.println(ca.toString());
        ca.cambiarInteres(0.5);
        ca.retirar(1200);
        ca.actualizarSaldo();
        ca.retirar(700);
        ca.actualizarSaldo();
        ca.ingresar(400);
        ca.actualizarSaldo();
        ca.verSaldoca(ca.getIvLargo());
    }
}
