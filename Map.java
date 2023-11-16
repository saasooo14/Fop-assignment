/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;


import java.util.Scanner;
   
public class Map{
    public void map(){
        final int mapSize = 40;
        char[][] gameMap = new char[mapSize][mapSize];

        // Initialize the map with empty spaces
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                gameMap[i][j] = ' ';
            }
        }

        // Add obstacles (randomly in this example)
        int numObstacles = 15;
        for (int i = 0; i < numObstacles; i++) {
            int x = (int) (Math.random() * mapSize);
            int y = (int) (Math.random() * mapSize);
            gameMap[y][x] = '#';
        }

        // Initial player position
        int playerX = 20;
        int playerY = 20;
        gameMap[playerY][playerX] = 'P'; // 'P' represents the player

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
         
        // Main game loop
         while (true) {
            // Display the map
            for (int i = 0; i < mapSize; i++) {
                for (int j = 0; j < mapSize; j++) {
                    if (i == playerY && j == playerX) {
                        System.out.print("[P]");
                    } else {
                        System.out.print("< " + gameMap[i][j] + " >");
                        // design the map
                    }
                }
                System.out.println();
            }

            // Get user input
            System.out.println("Use W, A, S, D to move (Q to quit): ");
            String move = scanner.nextLine().toUpperCase();
           
            // Clear the player's current position
            gameMap[playerY][playerX] = ' ';
        
         
            // Update player's position based on input
            if (move.equals("W") && playerY > 0 && gameMap[playerY - 1][playerX] != '#') {
                playerY--;
                
            } else if (move.equals("A") && playerX > 0 && gameMap[playerY][playerX - 1] != '#') {
                playerX--;
                 
            } else if (move.equals("S") && playerY < mapSize - 1 && gameMap[playerY + 1][playerX] != '#') {
                playerY++;
            } else if (move.equals("D") && playerX < mapSize - 1 && gameMap[playerY][playerX + 1] != '#') {
                playerX++;
            } else if (move.equals("Q")){
                break; // Quit the game
            }
            
          
            // Update the player's new position
            gameMap[playerY][playerX] = 'P';
          }
            
        // Close the scanner
        scanner.close();
      
         
    }
}


    


    


