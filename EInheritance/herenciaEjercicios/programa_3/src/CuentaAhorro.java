/**
 * Created by Martincorona007 on 17/04/2017.
 */
public class CuentaAhorro extends Cuenta {
    public double ivLargo;
    public double ivMin;

    public CuentaAhorro(){
        super();
    }
    public CuentaAhorro(long numeroCuenta, double saldo, Persona cliente, double ivLargo, double ivMin) {
        super(numeroCuenta, saldo, cliente);
        this.ivLargo = ivLargo;
        this.ivMin = ivMin;
    }
    public void retirar(double exit){
        double esx=0;
        esx=saldo-exit;
        if (esx>=ivMin){
            saldo=saldo-exit;
            System.out.println("Retiro: "+exit);
        }else{
            System.out.println("No puede retirar "+exit);
        }

    }
    public void cambiarInteres(double ci){
        System.out.println("Nuevo interes: "+ci);
    }
    public double getIvLargo(){
        return ivLargo;
    }
    public String toString(){
        return "N° de cuenta: "+numeroCuenta+"\nSaldo: "+saldo+"\nInteres variable anual: "+ivLargo+"%\nInteres variable minimo: "+ivMin;
    }
}
