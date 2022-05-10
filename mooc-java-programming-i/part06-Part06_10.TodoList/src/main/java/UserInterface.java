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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start() {
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                todoList.add(toAdd);
                continue;
            }
            
            if(command.equals("list")){
                todoList.print();
                continue;
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int number = scanner.nextInt();
                todoList.remove(number);
            }
        }
        //stops
    }
}
