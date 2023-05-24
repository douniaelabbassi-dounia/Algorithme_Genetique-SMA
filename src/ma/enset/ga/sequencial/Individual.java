package ma.enset.ga.sequencial;

import java.util.Random;

public class Individual implements Comparable{
    private char genes[]=new char[7];
    private String alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String target = "bonjour";
    private int fitness;
   public Individual() {
       Random rnd=new Random();
       for (int i=0;i<genes.length;i++){
           int index= rnd.nextInt(alphabet.length());
           genes[i]=alphabet.charAt(index);
       }
   }
    public void calculateFitness(){
        fitness=0;
        for (int i=0;i<genes.length;i++){
            if(target.charAt(i)==genes[i]){
                fitness=fitness+1;
            }
        }
    }

    public int getFitness() {
        return fitness;
    }

    public char[] getGenes() {
        return genes;
    }

    @Override
    public int compareTo(Object o) {
        Individual individual=(Individual) o;
        if (this.fitness>individual.fitness)
            return 1;
        else if(this.fitness<individual.fitness){
            return -1;
        }else
            return 0;
    }
}
