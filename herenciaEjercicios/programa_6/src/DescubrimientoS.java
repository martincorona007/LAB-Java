/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class DescubrimientoS extends SateliteNatural {
    private String nameDescubridor;
    private String fechadescubrimiento;
    private int dia;
    private int mes;
    private int anio;

    public DescubrimientoS(String nameDescubridor) {
        this.nameDescubridor = nameDescubridor;

    }
    public void fechadescubrimiento(String fecha){
        this.fechadescubrimiento=fecha;

    }
    public void imprimeFecha(){
        System.out.println(fechadescubrimiento);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private static String meses[] = {"Enero"
            , "Febrero"
            , "Marzo"
            , "Abril"
            , "Mayo"
            , "Junio"
            , "Julio"
            , "Agosto"
            , "Septiembre"
            , "Octubre"
            , "Noviembre"
            , "Diciembre"};

    public String toString(){
    return "Descubrimiento\n Descrubridor: "+nameDescubridor+"\n Fecha: "+getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }

}
