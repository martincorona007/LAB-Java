/**
 * Created by Martincorona007 on 23/04/2017.
 */
public class PuertaCoche implements PuertaBloqueable, Alarma {
    private boolean estaBloqueada;

    public boolean getEstaBloqueada() {
        return estaBloqueada;
    }

    public void setEstaBloqueada(boolean estaBloqueada) {
        this.estaBloqueada = estaBloqueada;
    }

    @Override
    public void alarmaActivada() {
        System.out.println("Alarma Activada");
    }

    @Override
    public void activarAlarma() {
        System.out.println("Activar Alarma");
    }

    @Override
    public void desactivarAlarma() {
        System.out.println("Descativar Alarma");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Abrir Puerta");
    }

    @Override
    public void cerrarPuerta() {
        System.out.println("Cerrar Puerta");
    }

    @Override
    public void bloqueaPuerta() {
        System.out.println("Bloquear Puerta");
    }

    @Override
    public void desbloquearPuerta() {
        System.out.println("Desbloquear Puerta");
    }
    public String toString(){
        return "Esta bloqueada: "+estaBloqueada;
    }
}
