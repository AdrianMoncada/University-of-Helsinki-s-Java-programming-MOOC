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
public class Stack {
    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.stackList.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.stackList.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stackList;
    }
    
    public String take() {
String lastOne = stackList.get(stackList.size() - 1);
stackList.remove(lastOne);
return lastOne;

    }
    
    
}
