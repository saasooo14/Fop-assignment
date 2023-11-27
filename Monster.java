/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
public class Monster {
   String name; // Name of the monster.
    int healthPoints; // Current health points of the monster.
    int manaPoints; // Current mana points of the monster.
    int physicalAttack; // Attack attribute for dealing damage.
    int magicalAttack; // Attack attribute for dealing damage.
    int physicalDefense; // Defense attribute for mitigating damage.
    int magicalDefense; // Defense attribute for mitigating damage.

    // constructor
    public Monster(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.physicalAttack = physicalAttack;
        this.magicalAttack = magicalAttack;
        this.physicalDefense = physicalDefense;
        this.magicalDefense = magicalDefense;
    }
 
}
  class goblin extends Monster{

    public goblin(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense) {
        super("Goblin",40,0,10,0,5,2);
    }
   
 }
    
   class skeleton extends Monster{

    public skeleton(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense) {
        super("Skeleton",60,0,12,0,7,3);
    }
       
   }

  class witch extends Monster{
    public witch(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense) {
        super("Witch",50,80,8,20,6,12);
    }     
  }

class orc extends Monster{

    public orc(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense) {
        super("Orc",70,0,15,0,9,4);
    }
    
}

class harpy extends Monster{
    public harpy(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense) {
        super("Harpy",60,20,14,10,8,8);
    }
    
}