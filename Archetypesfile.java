/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
import java.io.*;
class Archetypesfile {
    public static void main(String[] args) {
        try{
         BufferedWriter bw = new BufferedWriter(new FileWriter
        ("C:\\Users\\ONG KAI YIN\\Desktop\\test\\archytypes.txt.txt")); 
         bw.write("Warrior,300,50,80,20,70,50\n");
         bw.write("Mage,200,150,30,100,20,30\n");
         bw.write("Rogue,250,75,60,40,50,40\n");
         bw.write("Paladin,350,100,70,60,80,60\n");
         bw.write("Archer,240,60,65,50,45,30\n");
         bw.close();
        }catch(Exception ex){
            return;
        }
            

    }
}
