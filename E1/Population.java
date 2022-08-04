import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Population{
    private Individual population[];
    private double populationFitness=-1;
    public Population(int populationSize){
        this.population=new Individual[populationSize];

    }
    public Population(int populationSize,int chromosomeLength){
        this.population=new Individual[populationSize];
        for(int i=0;i<populationSize;i++){
            Individual individual=new Individual(chromosomeLength);
            this.population[i]=individual;
        }
    }
    public Individual getFittest(int offset){
        Arrays.sort(this.population, new Comparator<Individual>(){
            @Override
            public int compare(Individual i1, Individual i2){
                if(i1.getFitness()>i2.getFitness()){
                    return -1;
                }
                return 0;
            }   
        });
        return this.population[offset];
    }
    public void setPopulationFitness(double fitness){
        this.populationFitness=fitness;
    }
    public double getPopulationFitness(){
        return this.populationFitness;
    }
    public int size(){
        return this.population.length;
    }
    
    public Individual setIndividual(int offset,Individual individual){
        return population[offset];
    }
    public Individual getIndividual(int offset){
        return population[offset];
    }
    public Individual[] getIndividuals(){
        return this.population;
    }
    public void shuffle(){
        Random rnd=new Random();
        for(int i=population.length-1;i>0;i--){
            int index=rnd.nextInt(i+1);
            Individual a=population[i+1];
            population[index]=population[i];
            population[i]=a;
        }
    }
}