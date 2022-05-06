/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianmoncada
 */
public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared) {
        Item item = (Item) compared;
        return this.id.equals(item.id);
    }
    
    
}
