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
    
    public MenuView(MenuController menuController){
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
   public int getUserChoice(){
       try{
           return Integer.parseInt(scanner.nextLine().trim());
       } catch (NumberFormatException e){
           return -1;
    }

   }
   public void userChoice(){
         int choice;
    do{
        displayMenu();
        choice = getUserChoice();
        try {
            switch (choice) {
                case 1:
                    menuController.registerCustomer();
                    break;
                case 2:
                    menuController.updateCustomer();
                    break;
                case 3:
                    menuController.searchCustomer();
                    break;
                case 4:
                    menuController.displayFeastMenu();
                    break;
                case 5:
                    menuController.placeFeastOrder();
                    break;
                case 6:
                    menuController.updateOrder();
                    break;
                case 7:
                    menuController.saveDataToFile();
                    break;
                case 8:
                    menuController.displayCustomerOrderList();
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            // TODO: handle exception
        }
    } while (choice != 0);
   }

}
