/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication64;

/**
 *
 * @author PC
 */
import java.util.*;
public class JavaApplication64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue <String> queue = new LinkedList<String>();
        String [] Arr ={"AA","BB","CC","CCC", "DD", "EE","HH", "FF", "GG" };
        while(true){
        System.out.println("MENU");
         System.out.println("[1] Stacks");
         System.out.println("[2] Queues");
         System.out.println("[3] Tree");
         System.out.println("[4] EXIT");
         int menu = scanner.nextInt();
        switch(menu){
            case 1:
                while(true){
                 System.out.println("LIBRARY APPLICATION FOR STACKS");
                System.out.println("[1] ADD BOOKS");
                System.out.println("[2] Delete BOOKS");
                System.out.println("[3] Display BOOKS");
                System.out.println("[4] EXIT LIBRARY");
                int choose = scanner.nextInt();
                if(choose == 1){
                System.out.println("WELCOME TO LIBRARY");
                System.out.println("Add books to library [Enter 'quit' to delete]");
            while(true){
            String elements = scanner.nextLine();
            if(elements.equalsIgnoreCase("quit")){
                break;
            }
            stack.push(elements);
            }
            
          System.out.println("LIST OF BOOKS");
        for(String stac : stack){
            System.out.println(stac);
            System.out.println("-----------------");
            }
          }else if(choose == 2){
              if(stack.empty()){
                System.out.println("NO BOOKS IN LIBRARY");
            }else{
              scanner.nextLine();
              System.out.println("REMOVE BOOKS from Library");
               System.out.println("REMOVE ELEMENTS");
                stack.pop();
        
          System.out.println("LIST OF BOOKS");
              }
        for(String stac : stack){
            System.out.println(stac);
            System.out.println("-----------------");
        }
          }else if(choose == 3){
            if(stack.empty()){
                System.out.println("NO BOOKS IN LIBRARY");
            }else{
           System.out.println("BOOKS IN LIBRARY");
           for(String stac : stack){
            
            System.out.println(stac);
            System.out.println("-----------------");
           }
        }
            }else if(choose == 4){
               break;
            }
           
        }
             break;
            case 2:
                while(true){
                System.out.println("WELCOME TO DRIVE-THRU");
                System.out.println("[1] ENTER CUSTOMER NAME");
                System.out.println("[2] REMOVE CUSTOMER NAME");
                System.out.println("[3] DISPLAY CUSTOMER");
                System.out.println("[4] EXIT DRIVE THRU");
                int drive = scanner.nextInt();
                if(drive == 1){
                    System.out.println("ENTER CUSTOMER NAME");
             while(true){
            String order = scanner.nextLine();
            if(order.equalsIgnoreCase("quit")){
                break;
            }
            queue.offer(order);
            }
              System.out.println("LIST OF CUSTOMERS");
        for(String que : queue){
            System.out.println(que);
            System.out.println("-----------------");
            }
                }else if(drive == 2){
                    if(queue.isEmpty()){
                System.out.println("NO CUSTOMER IN LINE");
            }else{
              System.out.println("REMOVE CUSTOMER from Line");
                queue.remove();
                System.out.println("CUSTOMER IN LINE");
           for(String que : queue){ 
            System.out.println(que);
            System.out.println("-----------------");
                }
                    }
                }else if(drive == 3){
                    if(queue.isEmpty()){
                System.out.println("NO CUSTOMER IN LINE");
            }else{
                    System.out.println("CUSTOMER IN LINE");
           for(String que : queue){ 
            System.out.println(que);
            System.out.println("-----------------");
                }
                    }  
                }else if(drive == 4){
                    break;
                }
            
    }
                break;
            case 3:
                System.out.println("In Order: ");
                System.out.println(Arr[3] + " " + Arr[1] + " " +Arr[6] + " " +Arr[4] + " " +Arr[0] + " " +Arr[7]+ " " +Arr[8] + " " +Arr[5] + " " +Arr[2]);
                System.out.println("Pre Order: ");
                System.out.println(Arr[0] + " " +Arr[1] + " " +Arr[3] + " " +Arr[6] + " " +Arr[4] + " " +Arr[2] + " " +Arr[5] + " " +Arr[7] + " " +Arr[8]);
                System.out.println("Post Order: ");
                System.out.println(Arr[6] + " " +Arr[3] +" " + Arr[4] +" " + Arr[1] +" " + Arr[7] + " " +Arr[8] +" " + Arr[5] +" " + Arr[2] +" " + Arr[0]);
                break;
                
            case 4:
                System.exit(0);
            default:
                System.out.println("INVALID INPUT");
                break;
    }        
         
         
         
         
         
         
         
        
    }
    
}
}