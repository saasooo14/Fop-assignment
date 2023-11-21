/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */

public class Archetype {
    String name;
    int healthPoints;
    int manaPoints;
    int physicalDefense;
    int magicalDefense;
    int physicalAttack;
    int magicalAttack;
    int playerExp;
    int playerlevel;
    // constructor
    public  Archetype(String name,int healthPoints ,int manaPoints,int physicalDefense,int magicalDefense,int physicalAttack,int magicalAttack,int playerExp,int playerlevel){
        this.name=name;
        this.healthPoints=healthPoints;
        this.magicalDefense=magicalDefense;
        this.manaPoints=manaPoints;
        this.physicalDefense=physicalDefense;
        this.physicalAttack=physicalAttack;
        this.magicalAttack=magicalAttack;
        this.playerExp=playerExp;
        this.playerlevel=playerlevel;
    }
   
    public void spell(){
        
    }
    public void levelup(String name,int playerExp,int playerlevel){
        int[] level = { 50,100,150,200,250,300,350,400,450,500,   // first 10 level
                        600,700,800,900,1000,1100,1200,1300,1400,1500,     // level 11 -20
                        1700,1900,2100,2300,2500,2700,2900,3100,3300,3500, // level 21-30
                             4000,4500,5000,5500,6000};                       // level 31-35
    if(playerExp>=level[playerlevel]){
        System.out.println("Congrats "+name+" has level up! Current level: level"+playerlevel+1);
        System.out.println("Current Exp :"+level[playerlevel]);
    }
    }
   
}
    class warrior extends Archetype{
    public warrior(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
        super("Warrior",300,50, 80, 20, 70, 50, 0, 0);
   }
    //Health Points and defenses will receive significant boosts.
    public void levelup(){
     healthPoints+=100;
     manaPoints+=10;
     physicalDefense+=30;
     magicalDefense+=30;
     physicalAttack+=20;
     magicalAttack+=10;
    }
    
    }



    class Mage extends Archetype{
    public Mage(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
         super("Mage",200,150,30,100,20,30,0,0);
        }
    public void levelup(){
        // Magical Attack and Mana Points will experience substantial improvements.
     healthPoints+=50;
     manaPoints+=30;
     physicalDefense+=10;
     magicalDefense+=10;
     physicalAttack+=10;
     magicalAttack+=50;
    }
}
   
    class Rogue extends Archetype{
     public Rogue(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
        super("Rogue",250,75,60,40,50,40,0,0);
    }
        public void levelup(){
            //Both Physical Attack and Physical Defense will be enhanced.
     healthPoints+=70;
     manaPoints+=10;
     physicalDefense+=30;
     magicalDefense+=10;
     physicalAttack+=30;
     magicalAttack+=10;
    }
    }

    class Paladin extends Archetype{

    public Paladin(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
        super("Paladin",350,100,70,60,80,60,0,0);
    }
       public void levelup(){
           // All forms of Attack will become more potent.
      healthPoints+=70;
     manaPoints+=10;
     physicalDefense+=10;
    magicalDefense+=10;
     physicalAttack+=30;
     magicalAttack+=30;
    } 
    }

    class Archer extends Archetype{
     public Archer(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
        super("Archer",240,60,65,50,45,30,0,0);
    }
       public void levelup(){
           // Physical Attack will be substantially strengthened.
     healthPoints+=50;
     manaPoints+=15;
     physicalDefense+=10;
     magicalDefense+=10;
     physicalAttack+=50;
     magicalAttack+=10;
    } 
    }