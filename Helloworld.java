/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Helloworld {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("What is your name?");
      System.out.print("input, please =>");
      String name = sc.nextLine();
      System.out.println("You are welcome,"+name+ ".To HelloWorld");
      System.out.println("What can l help you with?");
      System.out.print("input, please =>");
      String Location = sc.nextLine();
       System.out.println("The place you are looking for called,"+  Location  + ".Is not on our map");
      
      
      
    }
    
}
