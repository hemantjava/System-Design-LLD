package org.example;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int size; //size of board
    private final Map<Integer, Integer> snakes; //start,end
    private final Map<Integer, Integer> ladders;//start,end

    public Board(int size) {
        this.size = size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
    }

    public void addSnake(int start, int end) {
        snakes.put(start, end);
    }

    public void addLadder(int start, int end) {
        ladders.put(start, end);
    }

    public int getSize() {
        return size;
    }

    public Map<Integer, Integer> getSnakes() {
        return snakes;
    }

    public Map<Integer, Integer> getLadders() {
        return ladders;
    }
}

