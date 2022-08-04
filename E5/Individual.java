import java.lang.Math;
import java.util.Random;
public class Individual{
    private int[] chromosome;
    private int fitness=-1;
    
    public Individual(){}

    public Individual(int chromosomeLength){
        Random random = new Random();
        this.chromosome=new int[chromosomeLength];
        //System.out.print("Indi "+chromosomeLength);
        for(int i=0;i<chromosomeLength;i++){
            int number = random.nextInt(11);
            if(0.5<Math.random()){
                this.setGene(i,number);
            }else{
                this.setGene(i,number);
            }
        }
    }
    
    public int[] getChromosome(){
        return this.chromosome;
    }
    public int getChromosomeLength(){
        return this.chromosome.length;
    }
    public void setGene(int offset,int gene){
        this.chromosome[offset]=gene;
    }
    public int getGene(int offset){
        return this.chromosome[offset];
    }
    public void setFitness(int fitness){
        this.fitness=fitness;
    }
    public int getFitness(){
        return this.fitness;
    }
    public String toString(){
        String output="";
        for(int i=0;i<this.chromosome.length;i++){
            output+=this.chromosome[i]+",";
        }
        return output;
    }


    public int getI(){
        int output=0;
        for(int i=0;i<this.chromosome.length;i++){
            if(this.chromosome[i]==1){
                output+=1;
            }
        }
        return output;
    }
    public int getValue(){
        int val=0;
        for(int i=0; i<this.chromosome.length; i++){
            if(this.chromosome[i]==1){
                val=val+(int)(this.chromosome[i]*Math.pow(2,i));
                //System.out.println("{"+val+"}");
            }
        }
        return val;
    }












    public void setLength(){

    }
    
    public void setGene(){

    }
    public void setFitness(){

    }
    /*public int getLength(){

    }
    public int getChromosome(){

    }

    public int getFitness(){

    }
*/
}