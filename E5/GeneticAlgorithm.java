import java.util.Arrays;
import java.lang.Math;
import java.util.Random;
public class GeneticAlgorithm{
    private int populationSize;
    private double mutationRate;
    private double crossoverRate;
    private int elitismCount;
    private int totalFitness;
    public GeneticAlgorithm(int populationSize,double mutationRate,double crossoverRate,int elitismCount){
        this.populationSize=populationSize;
        this.mutationRate=mutationRate;
        this.crossoverRate=crossoverRate;
        this.elitismCount=elitismCount;
    }
    public Population initPopulation(int n){
        Population obj_pop=new Population(this.populationSize,n);
        return obj_pop;
    }
    public int calcFitness(Individual individual){
        int fitness=0;
        for(int i=0;i<individual.getChromosomeLength();i++){
            //System.out.print("<"+individual.getGene(i)+">");
            switch(i){
                case 0:
                    fitness+=individual.getGene(i);
                    System.out.print("[c1 "+fitness+" "+individual.getGene(i)+"]");
                break;
                case 1:
                    fitness+=individual.getGene(i)*2;
                    System.out.print("[c2 "+fitness+" "+individual.getGene(i)+"]");
                break;
                case 2:
                    fitness-=individual.getGene(i)*3;
                    System.out.print("[c3 "+fitness+" "+individual.getGene(i)+"]");
                break;
                case 3:
                    fitness+=individual.getGene(i);
                    System.out.print("[c4 "+fitness+" "+individual.getGene(i)+"]");
                break;
                case 4:
                    fitness+=individual.getGene(i)*4;
                    System.out.print("[c5 "+fitness+" "+individual.getGene(i)+"]");
                break;
                case 5:
                    fitness+=individual.getGene(i);
                    System.out.print("[c6 "+fitness+" "+individual.getGene(i)+"]");
                break;
            }
        }
        //System.out.print("Fitness "+fitness);
        individual.setFitness(fitness);
        return fitness;
    }
   
    public void evalPopulation(Population population){
        int populationFitness=0;
        for(Individual individual:population.getIndividuals()){
            populationFitness+=calcFitness(individual);
        }
        //System.out.print(" {PF "+populationFitness+"} ");
        population.setPopulationFitness(populationFitness);
    } 
    public boolean isTerminationConditionMet(Population population){
        int populationFitness=0;
        for(Individual individual:population.getIndividuals()){
        
            if((100-(calcFitness(individual)-30))==100){
                    System.out.print(" IsT "+(100-(individual.getFitness()-30))+" GetF "+individual.getFitness());
                    return true;
            }
        }
  /*          for(int i=0;i<population.getSize();i++){
                Individual individual=population.getFittest(i);
                 if((100-(individual.getFitness()-30))==100){
                    System.out.print(" IsT "+(100-(individual.getFitness()-30))+" GetF "+individual.getFitness());
                    return true;
                }
            }
*/
        
        return false;
    }
    public Individual selectParent(Population population){
        Individual individuals[]=population.getIndividuals();
        int populationFitness=population.getPopulationFitness();
        double rouletteWheelPosition=Math.random()*populationFitness;
        double spinWheel=0;
        for(Individual individual:individuals){
            spinWheel+=individual.getFitness();
            if(spinWheel>=rouletteWheelPosition){
                return individual;
            }
        }
        return individuals[population.getSize()-1];
    }
    public Population crossoverPopulation(Population population){
        Population newPopulation =new Population(population.getSize());
        for(int i=0;i<population.getSize();i++){
            Individual parent1=population.getFittest(i);
            if(this.crossoverRate>Math.random() && i>=this.elitismCount){
                Individual offspring=new Individual(parent1.getChromosomeLength());
                Individual parent2=selectParent(population);
                for(int j=0;j<parent1.getChromosomeLength();j++){
        
                        if(0.5>Math.random()){
                            offspring.setGene(j,parent1.getGene(j));
                        }else{
                            offspring.setGene(j,parent2.getGene(j));
                        }
                    
                }
                newPopulation.setIndividual(i,offspring);
            }else{
                newPopulation.setIndividual(i,parent1);
            }
        }
        return newPopulation;
    }
    public Population mutatePopulation(Population population){
        Population newPopulation=new Population(this.populationSize);
        Random random = new Random();
        for(int i=0;i<population.getSize();i++){
            Individual individual=population.getFittest(i);
            for(int j=0;j<individual.getChromosomeLength();j++){
                if(i>this.elitismCount){
                    if(this.mutationRate>Math.random()){
                        int newGene = random.nextInt(11);
                        /*if(individual.getFitness()==30){
                            newGene=0;
                        }*/
                        individual.setGene(j,newGene);
                    }
                }
                newPopulation.setIndividual(i,individual);
            }
        }
        return newPopulation;
    }
    public void setTotalFitness(int i){
        this.totalFitness=i;
    }
    public int getTotalFitness(){
        return totalFitness;
    }
    
    
    
    /*
    
    public int calculateFitness(){

    }
    public int selectParects(){

    }
    public void getPopulationFitness(){

    }
    public int evaluatePopulation(){

    }*/
}