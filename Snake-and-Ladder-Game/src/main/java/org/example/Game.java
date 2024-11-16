package org.example;

import java.util.*;

public class Game {
    private final Board board;
    private final Queue<Player> players;
    private final Dice dice;

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = new LinkedList<>(players);
        this.dice = new Dice();
    }

    public void play() {
        while (true) {
            Player player = players.poll();
            int roll = dice.roll();
            System.out.println(player.getName() + " rolled a " + roll);

            int newPosition = player.getPosition() + roll; //1st 0 + roll
            if (newPosition > board.getSize()) {
                System.out.println(player.getName() + " stays at " + player.getPosition());
                players.offer(player);
                continue;
            }

            if (board.getSnakes().containsKey(newPosition)) {
                System.out.println(player.getName() + " bitten by a snake! Sliding down.");
                newPosition = board.getSnakes().get(newPosition);
            } else if (board.getLadders().containsKey(newPosition)) {
                System.out.println(player.getName() + " climbed a ladder! Moving up.");
                newPosition = board.getLadders().get(newPosition);
            }

            player.setPosition(newPosition);//Here setting new position for the player
            System.out.println(player.getName() + " moved to " + newPosition);

            if (newPosition == board.getSize()) { //if newPosition equals board size then player wins
                System.out.println(player.getName() + " wins!");
                break;
            }
            //Reach this point and player won't win add player to back in the queue
            // poll player here if 23 line number condition not passed
            players.offer(player);
        }
    }
}

