/**
 * Created by Martincorona007 on 20/04/2017.
 */
public class Vector {
    public static void main(String[] args) {
                //alumno
        Persona p = new Persona();
        Direccion n11 = new Direccion("Av. Jalsco", "Guadalajara", 45200, "Mexico");
        Estudiante n111 = new Estudiante(24064);
        p.setNombre("Ramon");
        p.setApellidos("Valdez");
        p.setNIF("792245GJS");

            //imprimo al studiante
        System.out.println(p.indentificate());
        System.out.println(n111);
        n11.verDatos();
        System.out.println();

                //profe
        Persona p1=new Persona();
        Direccion d=new Direccion("Av. Juarez","Tabasco",45200,"Mexico");
        p1.setNombre("Alejandro");
        p1.setApellidos("Garcia");
        p1.setNIF("756984DH");
        Profesor pro=new Profesor("Sala de juntas");

        System.out.println(p1.indentificate());
        System.out.println(pro);
        d.verDatos();

            //alumno
        //usando mutadores
        Persona p2=new Persona();
        Direccion d1=new Direccion("Av. Laureles","Guadalajara",45789,"Mexico");
        p2.setNombre("Emiliano");
        p2.setApellidos("Zapata");
        p2.setNIF("HD7912F");
        Estudiante e=new Estudiante(0);
        e.setIdEstudiante(457891);

        System.out.println(p2.indentificate());
        System.out.println(e);
        d1.verDatos();

        //profe
        Persona p3=new Persona();
        Direccion d2=new Direccion("Av. California","Guadalajara",45789,"Mexico");
        p3.setNombre("Joaquin");
        p3.setApellidos("Loera");
        p3.setNIF("47855DG");
        Profesor pro1=new Profesor("");
        pro1.setDespacho("Sala de maestros");

        System.out.println(p3.indentificate());
        System.out.println(pro1);
        d2.verDatos();




    }
}
