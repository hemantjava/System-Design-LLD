package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Board board = new Board(100);

        // Adding snakes taking players position down side
        board.addSnake(14, 7);
        board.addSnake(31, 20);
        board.addSnake(98, 79);

        // Adding ladders taking players position up side
        board.addLadder(3, 22);
        board.addLadder(15, 44);
        board.addLadder(70, 91);

        // Players
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");

        //Game
        Game game = new Game(board, Arrays.asList(p1, p2));
        game.play();
    }
}
