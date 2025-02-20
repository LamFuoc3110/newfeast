/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.MenuController;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MenuView {
    private static final Scanner scanner = new Scanner(System.in);
    private final MenuController menuController;
    
    public MenuView(MenuController menuController1){
    this.menuController = menuController;
    }
    
    public void displayMenu(){
        System.out.println("\n=== Traditional Feast Order Management System ===");
        System.out.println("1. Register customers");
        System.out.println("2. Update customer information");
        System.out.println("3. Search for customer by name");
        System.out.println("4. Display feast menus");
        System.out.println("5. Place a feast order");
        System.out.println("6. Update order information");
        System.out.println("7. Save data to file");
        System.out.println("8. Display Customer/Order lists");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
//    public void getUserChoice(){
//        try{
//            return Integer.parseInt(scanner.nextLine().trim());
//        } catch (NumberFormatException e){
//            return -1;
//        }
//        
//    
//    }
}
