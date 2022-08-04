/**
 * Created by Martincorona007 on 17/04/2017.
 */
public abstract class Cuenta {
   public long numeroCuenta;
   public double saldo;
   Persona cliente;
//creo constructor parametrizado con su funitures
    public Cuenta(){
        numeroCuenta=2007056;
        saldo=230.000;
        cliente=new Persona();
    }
    public Cuenta(long numeroCuenta, double saldo, Persona cliente){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente=cliente;
    }
    //method to give income
    public void ingresar(double income){
            saldo=saldo+income;
        System.out.println("Dinero ingresado: "+saldo);
    }

    public abstract void retirar(double exit);

    public void actualizarSaldo(){
        System.out.println("Saldo actual: "+saldo);
    }
    public void verSaldocc(){
        int t=1;
        saldo+=saldo*1.5/100*t;
        System.out.println("Saldo actual: "+saldo);
    }
    public void verSaldoca(double e){
        int t=1;
        saldo+=saldo*e/100*t;
        System.out.println("Saldo actual: "+saldo);
    }


}
