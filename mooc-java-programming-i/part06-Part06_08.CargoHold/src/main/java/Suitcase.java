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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int weight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
        this.weight = 0;
    }
    
    public void addItem(Item item) {
        if(maximumWeight >= weight + item.getWeight() ){
            this.items.add(item);
            this.weight += item.getWeight();
        }  
    }

    @Override
    public String toString() {
        String string = "items";
        if(items.isEmpty()){
            string = "no items";
            return string + " (" + weight + " kg)";
        }
        
        if(items.size() == 1){
            string = "item";
            return string + " (" + weight + " kg)";
        }
        
        return items.size() + " " + string + "(" + weight + " kg)";
    }
    
    public void printItems() {
        for(Item item:items){
            System.out.println(item.toString()); 
        }
    }

    public int totalWeight() {
        int total = 0;
        for(Item item:items){
            total += item.getWeight();
        }
        
        return total;
    }
    
    public Item heaviestItem() {
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        
        for(Item item:items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
