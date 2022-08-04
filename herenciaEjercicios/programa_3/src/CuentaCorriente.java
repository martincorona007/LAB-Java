/**
 * Created by Martincorona007 on 17/04/2017.
 */
public class CuentaCorriente extends Cuenta{
   public static final double INTERES_FIJO=1.5;

    //del metodo abstracto
    public void retirar(double exit){
        if (exit>=saldo){
            System.out.println("No puede retirar esa cantidad");
        }else{
            saldo=saldo-exit;
            System.out.println("Retiro: "+saldo);
        }

    }
//imprimo clienre
    public String toString() {
        return "N° cuenta: "+numeroCuenta+"\nSaldo:" + saldo+"\nInteres fijo: "+INTERES_FIJO+"%";
    }
}
