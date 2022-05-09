/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianmoncada
 */
import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    private int weight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(maximumWeight >= weight + suitcase.totalWeight()){
            suitcases.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        String string = "suitcases";
        if(suitcases.isEmpty()){
            string = "no suitcases";
            return string + " (" + weight + " kg)";
        }
        
        if(suitcases.size() == 1){
            string = "suitcase";
            return string + " (" + weight + " kg)";
        }
        
        return suitcases.size() + " " + string + "(" + weight + " kg)";
    }
    
    public void printItems(){
        for(Suitcase item: suitcases){
            item.printItems();
        }
    }
    
    
}
