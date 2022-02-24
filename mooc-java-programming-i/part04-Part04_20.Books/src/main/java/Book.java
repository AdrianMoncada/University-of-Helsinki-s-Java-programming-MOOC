/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianmoncada
 */
public class Book {
    private String title;
    private int pages;
    private int publication;
    
    public Book(String title, int pages, int publication){
        this.title = title;
        this.pages = pages;
        this.publication = publication;
    }
    
    public String getEverything(){
        return this.title + ", " + this.pages + " pages, " + this.publication;
    }
    
    public String getName(){
        return this.title;
    }
}
