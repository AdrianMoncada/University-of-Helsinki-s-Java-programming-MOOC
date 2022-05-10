/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianmoncada
 */
import java.util.Scanner;
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            if(input.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
                continue;
            }
            
            if(input.equals("search")){
                System.out.println("To be translated: ");
                String translate = scanner.nextLine();
                
                if(dictionary.translate(translate) == null){
                    System.out.println("Word " + translate + " was not found");
                    continue;
                }
                System.out.println(dictionary.translate(translate));
                continue;
            }
            
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
        
    }
}
