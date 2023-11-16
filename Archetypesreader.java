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

class Archetype {
    String name;
    int healthPoints;
    int manaPoints;
    int physicalDefense;
    int magicalDefense;
    int physicalAttack;
    int magicalAttack;
    }
    public void levelup(){
        
    }

    class Warrior extends Archetype {
       
    }
    


class Mage extends Archetype {
    
     }
 

        

class Thief extends Archetype {
   
}

class Priest extends Archetype{
 
}

class Archer extends Archetype {
   
   
}
  
  
    public class Archetypesreader {
      public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new FileReader
        ("C:\\Users\\ONG KAI YIN\\Desktop\\test\\archytypes.txt.txt")); 
        String s;
        while((s=br.readLine())!= null){
            System.out.println(s);
        }
    }catch(Exception ex){
        return;
    }
}
}
    
