/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class TestProyecto {
    public static void main(String[] args) {
                                                        //PLANETS
        Planetas p = new Planetas();
        p.nombrePlanet("Mercurio");
        System.out.println(p.toString());

        ElementosOrbitales eo = new ElementosOrbitales(0.2408467, 174.796, 0.00, 7.00);
        System.out.println(eo.toString());

        ElementosOrbitalesDerivados eod = new ElementosOrbitalesDerivados("58 dias y 16 horas terrestres", "87 dias y 23 horas terrestres", 0, 0.387);
        System.out.println(eod.toString());

        CaracteristicasFisicas cf = new CaracteristicasFisicas("3.302*10^23", 5.43, 4879.4, 57.999, 2.8);
        System.out.println(cf.toString());

        CaracteristicasAtmosfericas ca = new CaracteristicasAtmosfericas("Potasio 31,7%,Sodio 24,9%,Oxigeno 9,5%", 700, 90, 440);
        System.out.println(ca.toString());

        Planetas p2=new Planetas();
        p.nombrePlanet("Sol");
        System.out.println(p.toString());
        ElementosOrbitales eo2=new ElementosOrbitales(0,0,7.25,67.23);
        System.out.println(eo2.toString());
        ElementosOrbitalesDerivados eod2=new ElementosOrbitalesDerivados("27 dias 6 horas 36 minutos", "28 dias 4 horas 48 minutos",508,139000);
        System.out.println(eod2.toString());
        CaracteristicasFisicas cf2=new CaracteristicasFisicas("19891*10^30",1411,1392000,0,274);
        System.out.println(cf2.toString());
        CaracteristicasAtmosfericas ca2=new CaracteristicasAtmosfericas();
        ca2.sol("No tiene",5500,15);
        ca2.imprime();



                                                        //SATELITES
        SateliteNatural sn=new SateliteNatural();
        sn.nombresillo("Calisto");
        sn.whom("Jupiter");
        System.out.println(sn.toString());
        DescubrimientoS ds=new DescubrimientoS("G. Galilei");
        ds.setDia(7);
        ds.setMes(1);
        ds.setAnio(1610);
        //imprimo
        System.out.println(ds.toString());
        ElementosOrbitalesS eoss=new ElementosOrbitalesS(0.192,1.882700,0.0074);
        System.out.println(eoss.toString());
        CaracteristicasFisicasS cfs=new CaracteristicasFisicasS("1.075938",5.9,1.8344,4820.6,1.235);
        System.out.println(cfs.toString());



    }
}
