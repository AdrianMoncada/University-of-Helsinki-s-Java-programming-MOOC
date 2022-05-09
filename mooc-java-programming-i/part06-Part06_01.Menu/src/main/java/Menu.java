
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if(!meals.contains(meal)){
          this.meals.add(meal);  
        }   
    }
    
    public void printMeals(){
        for (String meal: this.meals){
            System.out.println(meal);
        }
    }

    @Override
    public String toString() {
        return "Menu{" + "meals=" + meals + '}';
    }
    
    public void clearMenu() {
        this.meals = new ArrayList<>();
    }
}
