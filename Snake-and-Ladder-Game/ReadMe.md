## Snake and Ladder Game
-> The design includes the main classes, their responsibilities, and how they interact.
*  **Key Requirements**
   * The game should support N players.
   * The board contains snakes and ladders.
   * Players roll a dice and move based on the outcome.
   * Snakes decrease the player's position; ladders increase it.
   * The first player to reach the final cell wins.
   
* **Classes and Responsibilities**

   **1. Board**

   * Represents the game board.
   * Stores snakes, ladders, and the size of the board.

  **2. Player**

   * Represents a player with a name and current position.

  **3. Dice**

   * Represents a dice that generates a random number.

  **4. Game**

   * Manages the gameplay, turns, and rules.