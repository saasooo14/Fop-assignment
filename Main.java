/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" ------------------------------------");
        System.out.println("|   Welcome to the adventure game    |");
        System.out.println(" ------------------------------------");
        System.out.println("In the peaceful land of Harmony, a sudden darkness fell over the horizon.\nMonstrous creatures, "
                            +"born of nightmares,surged forth to wreak havoc on\nthe once-tranquil countryside."
                            + "surged forth to wreak havoc on\nthe once-tranquil countryside."
                            + "The people of Harmony found themselves\nfacing a dire and unexpected "
                            + "threat.As the heroes of the land you are require\nto defeat the monsters "
                            + "to retrieve the harmony of the land.");
        System.out.println("Are you ready?");
        Scanner sc = new Scanner(System.in);
        System.out.println("<1>-I am ready!!!");
        System.out.println("<2>-I am not ready yet");
        
       // get user input 
        int y =0;
        boolean valid = false;
        while(!valid){
          System.out.print("Please insert 1 or 2 :");
        int num = sc.nextInt();
          if(num==1){
              System.out.println("Let us begin our journey!!!");
               valid = true;
        }else if(num==2){
              System.out.println("Nevermind come again when you are ready");
              valid = true;
        }else{
              System.out.println("invalid input!");
        }
       
    }
        
        // choose character
        System.out.println(" ----------------------------------");
        System.out.println("|            Character             | ");
        System.out.println(" ----------------------------------");
        System.out.println("Now you need to choose one of the character");
        System.out.println("<1>-Warrior\nCharacteristic-");
        System.out.println("<2>-Mage\nCharacteristic-");
        System.out.println("<3>-Rogue\nCharacteristic-");
        System.out.println("<4>-Paladin\nCharacteristic-");
        System.out.println("<5>-Archer\nCharacteristic-");
        int c = sc.nextInt();
        
        
        
        
        // Map for the game
        Map mapp = new Map();
        mapp.map();
}}

    

