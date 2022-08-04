/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class Planetas {
    Planetas(){

    }
        private String nombreDelPlaneta;


        public void nombrePlanet(String nombreDelPlaneta){
            this.nombreDelPlaneta=nombreDelPlaneta;
        }

        public String toString(){
            return "\t\t\tPLANETA\n Nombre del planeta: "+nombreDelPlaneta;
        }
}
